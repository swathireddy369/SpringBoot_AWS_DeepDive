package com.example.springboot_aws_deepdive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsDeepDiveApplication extends SpringBootServletInitializer {
    @GetMapping("/")
    public String home(){
        return "Welcome to AWS First Deployment.........!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsDeepDiveApplication.class, args);
    }

}
