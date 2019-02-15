package com.softech.didemo;

import com.softech.didemo.controllers.ConstructorInjectedController;
import com.softech.didemo.controllers.GetterInjectedController;
import com.softech.didemo.controllers.MyController;
import com.softech.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);


        System.out.println(context.getBean(MyController.class).hello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(GetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

    }

}

