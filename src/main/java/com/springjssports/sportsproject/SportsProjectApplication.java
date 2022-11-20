package com.springjssports.sportsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class SportsProjectApplication {

    public static void main(String[] args) {
     //    System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
        SpringApplication.run(SportsProjectApplication.class, args);
    }

}
