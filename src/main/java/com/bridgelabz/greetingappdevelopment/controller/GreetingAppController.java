package com.bridgelabz.greetingappdevelopment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingAppController {
    @GetMapping(value = "/greeting1")
    public String greeting() {
        return "Welcome to Greeting App..!";
//  GET-->      http://localhost:8081/greeting1
    }

    @PostMapping(value = "/greeting2")
    public String passQueryParameter
            (@RequestParam(name = "key") String key) {
        return "Hello " + key;
//  POST-->      http://localhost:8081/greeting2?key=greeting-app
    }

    @PutMapping(value = "/greeting3/{name}")
    public String passPathVariable
            (@PathVariable(name = "name") String name) {
        return "Hello " + name;
//  PUT-->      http://localhost:8081/greeting3/vrv
    }
}
