package com.example.mysampleclientproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MySampleClientProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySampleClientProjectApplication.class, args);
    }

}
