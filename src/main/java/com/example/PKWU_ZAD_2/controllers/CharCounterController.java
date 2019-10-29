package com.example.PKWU_ZAD_2.controllers;

import com.example.PKWU_ZAD_2.model.CounterResponse;
import com.example.PKWU_ZAD_2.services.CharCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CharCounterController  {

    @Autowired
    private CharCounterService charCounterService;

    @GetMapping("/countChars/{input}")
    public ResponseEntity<String> findAdmin(@PathVariable String input){
        return new ResponseEntity<>(charCounterService.countCharacters(input).toString(), HttpStatus.OK);
    }

}
