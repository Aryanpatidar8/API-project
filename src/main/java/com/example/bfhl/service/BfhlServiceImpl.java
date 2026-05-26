package com.example.bfhl.service;

import com.example.bfhl.dto.RequestDTO;
import com.example.bfhl.dto.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    private static final String USER_ID = "prachi_patidar_13122004";
    private static final String EMAIL = "prachipatidar1312@gmail.com";
    private static final String ROLL_NUMBER = "0827CI231096";

    @Override
    public ResponseDTO processData(RequestDTO requestDTO) {

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();
        List<Character> allLetters = new ArrayList<>();

        int sum = 0;

        for (String item : requestDTO.getData()) {

            if (item.matches("-?\\d+")) {
                int number = Integer.parseInt(item);
                sum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item.toUpperCase());

                for (char ch : item.toCharArray()) {
                    allLetters.add(ch);
                }

            } else {
                specialCharacters.add(item);
            }
        }

        String concatString = generateConcatString(allLetters);

        return new ResponseDTO(
                true,
                USER_ID,
                EMAIL,
                ROLL_NUMBER,
                oddNumbers,
                evenNumbers,
                alphabets,
                specialCharacters,
                String.valueOf(sum),
                concatString
        );
    }

    private String generateConcatString(List<Character> letters) {
        StringBuilder result = new StringBuilder();

        for (int i = letters.size() - 1; i >= 0; i--) {
            char ch = letters.get(i);

            if (result.length() % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }
}