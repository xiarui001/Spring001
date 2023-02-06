package com.xr.spring;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RocketMQTemplate template;

     @ExceptionHandler
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        //new Main().test();



    }


    @RequestMapping("/index")
    public String get(){
        template.convertAndSend("sanyouTopic", "三友的java日记");
        return "hello";

    }


}
