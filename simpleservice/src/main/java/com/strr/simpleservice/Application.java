package com.strr.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/{firstName}/{lastName}")
    public String hello(@PathVariable String firstName, @PathVariable String lastName) {
        return String.format("{\"message\": \"hello %s %s\"}", firstName, lastName);
    }
}
