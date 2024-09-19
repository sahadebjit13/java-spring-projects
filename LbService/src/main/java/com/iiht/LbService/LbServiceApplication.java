package com.iiht.LbService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbServiceApplication.class, args);
	}

}
