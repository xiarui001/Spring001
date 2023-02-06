package com.example.demo3.controller;

import com.example.demo3.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   @Autowired
    public Test t;

   @GetMapping("/index")
   public void test(){

       String[] beanDefinitionNames = t.context.getBeanNamesForType(BeanPostProcessor.class);
       for(int i=0; i<beanDefinitionNames.length; i++){
           System.out.println(beanDefinitionNames[i]);
       }
       System.out.println(t.context);
      // new Environment();
      // new AbstractApplicationContext();
   }

}
