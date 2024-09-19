package com.iiht.LbEurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LbEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbEurekaServiceApplication.class, args);
	}

}
