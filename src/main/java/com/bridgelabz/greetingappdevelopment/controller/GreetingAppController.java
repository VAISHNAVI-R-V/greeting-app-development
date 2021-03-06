package com.bridgelabz.greetingappdevelopment.controller;

import com.bridgelabz.greetingappdevelopment.dto.GreetingAppDto;
import com.bridgelabz.greetingappdevelopment.entity.GreetingAppEntity;
import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingAppController {

    @Autowired
    private GreetingAppService greetingAppService;

    @GetMapping(value = "/greeting1")
    public String greeting() {
        return "Welcome to Greeting App..!";
//  GET-->      http://localhost:8081/greeting1
    }

    @PostMapping(value = "/greeting2")
    public String passQueryParameter(@RequestParam(name = "key") String key) {
        return "Hello " + key;
//  POST-->      http://localhost:8081/greeting2?key=greeting-app
    }

    @PutMapping(value = "/greeting3/{name}")
    public String passPathVariable(@PathVariable(name = "name") String name) {
        return "Hello " + name;
//  PUT-->      http://localhost:8081/greeting3/vrv
    }

    @GetMapping("/greeting4")
    public String message() {
        return greetingAppService.message();
//  GET-->      http://localhost:8081/greeting4
    }

    @GetMapping("/greeting5")
    public String greetingMessage(
            @RequestParam(value = "firstName", defaultValue = "Vaishnavi") String firstName,
            @RequestParam(value = "lastName", defaultValue = "Vishwakarma") String lastName
    ) {
        return firstName + " " + lastName + greetingAppService.message();
//  GET-->      http://localhost:8081/greeting5?firstName=Vaibhav&lastName=Ravindra
    }

    @PostMapping("/greeting/message")
    public GreetingAppEntity saveGreetingMessage(
            @RequestBody GreetingAppDto greetingAppDto
    ) {
        return greetingAppService.addGreetingMessage(greetingAppDto);
//  POST-->      http://localhost:8081/greeting/message
    }

    @GetMapping("/greeting/message/{id}")
    public GreetingAppEntity greetingMessageById(
            @PathVariable int id
    ) {
        return greetingAppService.greetingMessageById(id);
//  POST-->         http://localhost:8081/greeting/message,
//  GET-->          http://localhost:8081/greeting/message/2
    }

    @GetMapping("/greeting/message-list")
    public List<GreetingAppEntity> greetingMessagesByList() {
        return greetingAppService.greetingAppEntityList();
//  POST-->     http://localhost:8081/greeting/message
//  GET-->      http://localhost:8081/greeting/message-list
    }

    @PutMapping("/greeting/message-edit/{id}")
    public GreetingAppEntity updateGreetingMessage(
            @PathVariable int id,
            @RequestBody GreetingAppDto greetingAppDto
    ) {
        return greetingAppService.updateGreetingMessageById(id, greetingAppDto);
//  POST-->     http://localhost:8081/greeting/message
//  PUT-->      http://localhost:8081/greeting/message-edit/1
    }

    @DeleteMapping("/greeting/message-delete/{id}")
    public GreetingAppEntity deleteGreetingMessage(
            @PathVariable int id
    ) {
        return greetingAppService.deleteGreetingMessage(id);
//  POST-->     http://localhost:8081/greeting/message
//  DELETE-->      http://localhost:8081/greeting/message-delete/1
    }
}
