package com.starter.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootSecurityStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityStarterApplication.class, args);
    }

}
