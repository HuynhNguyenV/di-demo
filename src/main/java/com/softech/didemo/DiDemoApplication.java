package com.softech.didemo;

import com.softech.didemo.controllers.ConstructorInjectedController;
import com.softech.didemo.controllers.GetterInjectedController;
import com.softech.didemo.controllers.MyController;
import com.softech.didemo.controllers.PropertyInjectedController;
import com.softech.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);


        MyController controller = (MyController) context.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }

}

