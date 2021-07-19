package com.example.JavaBrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello(){
        return "<h1>Welcome</h1>";
    }

    @RequestMapping("/user")
    public String sayHelloUser(){
        return "<h1>Welcome User </h1>";
    }

    @RequestMapping("/noauth")
    public String sayHelloNoAuth(){
        return "<h1>Welcome User No Auth </h1>";
    }

    @RequestMapping("/admin")
    public String sayAdminHello(){

        return "<h1>Hello Admin</h1>";
    }
    @RequestMapping("/welcome")
    public String WelcomePage(){
        return "<h1>This Block need no authorization </h1>";
    }
}
