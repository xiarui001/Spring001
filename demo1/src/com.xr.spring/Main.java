package com.xr.spring.controller;

import com.xr.spring.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    @Autowired
    User user;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        new Main().test();
    }

    public void test(){
        System.out.println(user.getName());
    }
}
