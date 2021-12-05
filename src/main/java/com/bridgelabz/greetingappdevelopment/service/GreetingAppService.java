package com.bridgelabz.greetingappdevelopment.service;

import com.bridgelabz.greetingappdevelopment.dto.GreetingAppDto;
import com.bridgelabz.greetingappdevelopment.entity.GreetingAppEntity;
import com.bridgelabz.greetingappdevelopment.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class GreetingAppService {
    @Autowired
    private GreetingAppRepository greetingAppRepository;

    public String message() {
        return "Hello World";
    }

    public GreetingAppEntity addGreetingMessage(GreetingAppDto greetingAppDto) {
        GreetingAppEntity greetingAppEntity = new GreetingAppEntity();
        greetingAppEntity.setContent(greetingAppDto.getContent());
        return greetingAppRepository.save(greetingAppEntity);
    }
//    public GreetingAppEntity greetingRepoMessage(GreetingAppDto greetingAppDto) {
//        GreetingAppEntity greetingAppEntity = new GreetingAppEntity();
//        greetingAppEntity.setMessage(greetingAppDto.getGreetingMessage());
//        return greetingAppRepository.save(greetingAppEntity);
//    }
}
