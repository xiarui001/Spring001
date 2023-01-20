package com.xr.spring.controller;

import com.xr.spring.dao.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/index")
public class Index {

    @Autowired
    private RandomNameGenerator rand;


    @GetMapping("/test")
    public String test(){
        return  rand.generate();
    }
}
