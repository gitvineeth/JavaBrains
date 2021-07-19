package com.example.JavaBrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello(){
        return "<h1>Welcome</h1>";
    }

}
