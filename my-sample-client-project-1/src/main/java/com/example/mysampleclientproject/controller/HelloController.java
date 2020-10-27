package com.example.mysampleclientproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello from my spring eureka client";
    }
}
