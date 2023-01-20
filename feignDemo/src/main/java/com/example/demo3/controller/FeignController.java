package com.example.demo3.controller;

import com.example.demo3.service.rpc.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignTest feign;

    @GetMapping("/testfeign")
    public String  testFeign(){
        return feign.test();
    }
}
