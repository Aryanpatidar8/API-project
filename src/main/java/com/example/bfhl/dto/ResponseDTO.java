package com.example.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ResponseDTO {

    @JsonProperty("is_success")
    private boolean isSuccess;

    @JsonProperty("user_id")
    private String userId;

    private String email;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("odd_numbers")
    private List<String> oddNumbers;

    @JsonProperty("even_numbers")
    private List<String> evenNumbers;

    private List<String> alphabets;

    @JsonProperty("special_characters")
    private List<String> specialCharacters;

    private String sum;

    @JsonProperty("concat_string")
    private String concatString;

    public ResponseDTO(boolean isSuccess, String userId, String email, String rollNumber,
                       List<String> oddNumbers, List<String> evenNumbers,
                       List<String> alphabets, List<String> specialCharacters,
                       String sum, String concatString) {
        this.isSuccess = isSuccess;
        this.userId = userId;
        this.email = email;
        this.rollNumber = rollNumber;
        this.oddNumbers = oddNumbers;
        this.evenNumbers = evenNumbers;
        this.alphabets = alphabets;
        this.specialCharacters = specialCharacters;
        this.sum = sum;
        this.concatString = concatString;
    }

    public boolean isSuccess() { return isSuccess; }
    public String getUserId() { return userId; }
    public String getEmail() { return email; }
    public String getRollNumber() { return rollNumber; }
    public List<String> getOddNumbers() { return oddNumbers; }
    public List<String> getEvenNumbers() { return evenNumbers; }
    public List<String> getAlphabets() { return alphabets; }
    public List<String> getSpecialCharacters() { return specialCharacters; }
    public String getSum() { return sum; }
    public String getConcatString() { return concatString; }
}