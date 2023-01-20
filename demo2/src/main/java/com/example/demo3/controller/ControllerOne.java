package com.example.demo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerOne {

    @GetMapping("/hello")
    public String test(){
        System.out.println("有人调用了生产者");
        return "hello";
    }
}
