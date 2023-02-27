package com.demo.ope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OpeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpeApplication.class, args);
	}

}
