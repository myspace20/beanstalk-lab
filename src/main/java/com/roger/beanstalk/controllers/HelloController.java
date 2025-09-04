package com.roger.beanstalk.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String index() {
        return "Hello World! from Roger's Beanstalk! with Github Actions";
    }
}
