package com.formacionbdi.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioConfigServerApplication.class, args);
	}

}
