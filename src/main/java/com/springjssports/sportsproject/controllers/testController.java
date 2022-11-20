package com.springjssports.sportsproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class testController {



@GetMapping("/testMethod")
public String getTestMethod(){
    return "Hello Cem";
}

}
