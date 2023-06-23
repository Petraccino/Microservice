package com.sistemi.informativi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TwitterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterServiceApplication.class, args);
	}

}
