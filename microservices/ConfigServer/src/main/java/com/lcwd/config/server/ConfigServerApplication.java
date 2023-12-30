package com.lcwd.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @implNote Creating configuration service by using 'spring-cloud-starter-config' dependency and using annotation
 * '@EnableConfigServer'. This service help us to write common configuration file that will further be used in all other
 * micro-services.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
		System.out.println("CONFIG-SERVICE Started !!");
	}

}
