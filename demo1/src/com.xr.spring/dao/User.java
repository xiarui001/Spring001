package com.xr.spring.dao;

import org.springframework.context.annotation.Bean;

//@Component
public class User  {

   @Bean
    public User getUser(){
        return new User();
    }

    private  int age=0;
    private  String name = "战三";



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
