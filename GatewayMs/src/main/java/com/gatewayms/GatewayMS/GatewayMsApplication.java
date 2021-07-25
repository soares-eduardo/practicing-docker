package com.gatewayms.GatewayMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayMsApplication {

	@Bean
	public RouteLocator buildRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/inventory/*").uri("http://inventoryms:8080"))
				.route(p -> p.path("/sales/*").uri("http://salesms:8080"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayMsApplication.class, args);
		System.out.println("Gateway is running.");
	}
}
