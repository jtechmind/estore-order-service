package com.jtechmind.estore_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EstoreOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoreOrderServiceApplication.class, args);
	}

}
