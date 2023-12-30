package com.lcwd.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @implNote This is Eureka Discovery Service for keeping status of all other services rather than itself. This is 
 * also called: 'Service Registry'. Created by using 'spring-cloud-starter' and 'spring-cloud-starter-netflix-eureka-server'
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
		System.out.println("EUREKA-SERVICE Started !!");
	}

}
