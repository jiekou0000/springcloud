package com.bill.serversecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServersecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServersecondApplication.class, args);
	}
}
