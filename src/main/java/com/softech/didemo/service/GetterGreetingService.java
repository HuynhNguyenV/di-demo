package com.softech.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - Getter Greeting Service";
    }
}
