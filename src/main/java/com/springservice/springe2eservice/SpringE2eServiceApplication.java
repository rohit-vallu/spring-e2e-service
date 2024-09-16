package com.springservice.springe2eservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringE2EServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringE2EServiceApplication.class, args);
    }

    public static String helloWorld() {
        return "Hello World";
    }

}
