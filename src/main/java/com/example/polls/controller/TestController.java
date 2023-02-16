package com.example.polls.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/")
    public String HelloWorld(){
        return "Hello From the Polls App. ";
    }


}
