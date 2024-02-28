package com.dailyKart.selllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SelllersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelllersApplication.class, args);
	}

}
