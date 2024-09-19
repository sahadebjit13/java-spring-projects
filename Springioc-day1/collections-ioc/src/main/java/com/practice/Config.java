package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice")
public class Config {

	@Bean(name = "p1")
	public Point createStartPoint() {
		return new Point(12, 19);
	}

	@Bean(name = "p2")
	public Point createEndPoint() {
		return new Point(20, 45);
	}

}
