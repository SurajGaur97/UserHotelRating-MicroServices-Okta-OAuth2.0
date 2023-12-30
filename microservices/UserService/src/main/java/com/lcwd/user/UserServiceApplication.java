package com.lcwd.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @implNote For enabling Eureka-Discovery client we need to use dependency 'spring-cloud-starter-netflix-eureka-client'
 * in this service to make it discoverable and then after we need to configure it in application.yml file
 * For using FienClient we need to add '@EnableFienClient' so that it can be enabled for using.
 */
@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println("USER-SERVICE Started !!");
	}

}
