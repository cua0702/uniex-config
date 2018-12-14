package com.kunpeng.uniex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class UniexConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniexConfigApplication.class, args);
	}

}
