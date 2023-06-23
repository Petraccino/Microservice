package com.sistemi.informativi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HealtCheckServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealtCheckServiceApplication.class, args);
	}

}
