package com.example.PKWU_ZAD_2.model;

import lombok.Data;

@Data
public class CounterResponse {
    private long lowerCaseLetters;
    private long upperCaseLetters;
    private int specialCharacters;
    private long digits;

    @Override
    public String toString(){
        return "number of lower case letters = " + lowerCaseLetters +
                "\nnumber of upper case letters = " + upperCaseLetters +
                "\nnumber of special characters = " + specialCharacters +
                "\nnumber of digits = " + digits;
    }
}
