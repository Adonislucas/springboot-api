package com.springboot_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/Welcome")
    public String welcome(){
        return "Welcome to my Spring Boot Web API";
    }
}
