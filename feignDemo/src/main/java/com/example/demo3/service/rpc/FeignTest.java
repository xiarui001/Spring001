package com.example.demo3.service.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "productor8080")
public interface FeignTest {

    @RequestMapping("/hello")
    public String test();
}
