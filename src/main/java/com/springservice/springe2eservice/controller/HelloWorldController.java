package com.springservice.springe2eservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/greetWorld")
    public String getGreeting() {
        return "Hello World";
    }

}