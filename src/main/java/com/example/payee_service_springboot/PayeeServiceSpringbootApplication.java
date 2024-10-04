package com.example.payee_service_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PayeeServiceSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayeeServiceSpringbootApplication.class, args);
	}

}
