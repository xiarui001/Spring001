package com.xr.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ControllerAdvice
public class Main {


@ExceptionHandler
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        //new Main().test();
    }


    @RequestMapping("/index")
    public String get(){
        return "hello";

    }


}
