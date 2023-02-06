package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {



	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
        EurekaServer server = new EurekaServer();


       // System.out.println(server.T.context);

	}

}
