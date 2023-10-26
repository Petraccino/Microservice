package com.sistemi.informativi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FacebookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacebookServiceApplication.class, args);
	}

}
