package com.iiht.LbGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LbGatewayConfig {

	@Bean
	RouteLocator CustomRouteLocator(RouteLocatorBuilder builder) {

		return builder.routes()
				.route("helloservice-route", r -> r.path("/test/**")
						.uri("lb://LBSERVICE"))
				.build(); // loadbalancer => lb
	}

}
