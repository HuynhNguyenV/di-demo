package com.softech.didemo.controllers;


import com.softech.didemo.service.GreetingService;
import com.softech.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
