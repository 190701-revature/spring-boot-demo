package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap the Spring boot application
 * The process of starting the spring boot app server using a main method
 * 
 *	@SpringBootApplication is a convenience annotation that combines three
 *other annotations:
 *		@Configuration - Act as a configuration class
 *		@EnableAutoConfiguration - Allows Spring Boot to autoconfigure
 *		@ComponentScan - Scan components from this package
 */

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		// This bootstraps Spring Boot - from here the server will run
		SpringApplication.run(Application.class, args);
	}
}
