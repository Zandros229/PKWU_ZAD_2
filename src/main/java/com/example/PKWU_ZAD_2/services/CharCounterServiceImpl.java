package com.example.PKWU_ZAD_2.services;

import com.example.PKWU_ZAD_2.model.CounterResponse;
import org.springframework.stereotype.Service;

@Service
public class CharCounterServiceImpl implements CharCounterService {

    private CounterResponse counterResponse = new CounterResponse();

    @Override
    public CounterResponse countCharacters(String input) {
        counterResponse.setUpperCaseLetters(input.chars()
                .filter(character -> (character > 64 && character < 91))
                .count());
        counterResponse.setLowerCaseLetters(input.chars()
                .filter(character -> (character > 96 && character < 123))
                .count());
        counterResponse.setDigits(input.chars()
                .filter(character -> (character > 47 && character < 58))
                .count());
        counterResponse.setSpecialCharacters(getSpecialCharacterCount(input));
        return counterResponse;
    }

    public int getSpecialCharacterCount(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        int theCount = 0;
        String specialChars = "/*!@# $%^&*()\"{}_[]|\\?/<>,.";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i + 1).codePointAt(0));
            if (specialChars.contains(s.substring(i, i+1))) {
                theCount++;
            }
        }
        return theCount;
    }

}
