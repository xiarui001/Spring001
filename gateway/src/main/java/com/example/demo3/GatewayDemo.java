package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy

public class GatewayDemo {



	public static void main(String[] args) {
		SpringApplication.run(GatewayDemo.class, args);
	}

}
