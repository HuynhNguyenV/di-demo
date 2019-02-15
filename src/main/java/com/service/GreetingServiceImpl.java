package com.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Huynh - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
