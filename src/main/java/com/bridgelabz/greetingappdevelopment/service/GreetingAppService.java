package com.bridgelabz.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    public String message() {
        return "Hello World";
    }
}
