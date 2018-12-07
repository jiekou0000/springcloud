package com.bill.serverfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServerfirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerfirstApplication.class, args);
    }

}
