package com.gaurav.dependency_injection_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Dependency_Injection_Demo_Application {
    public static void main(String[] args) {
        SpringApplication.run(Dependency_Injection_Demo_Application.class, args);
    }
}
