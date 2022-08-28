package com.tcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoRestServiceApp.class, args);
        System.out.println("Implementing rest service using spring boot.");
    }
}
