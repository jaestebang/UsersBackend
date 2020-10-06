package com.reaseguro.microservicios.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.reaseguro.microservicios.app.commons.user.models.entity"})
public class MicroserviciosUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUsersApplication.class, args);
	}

}
