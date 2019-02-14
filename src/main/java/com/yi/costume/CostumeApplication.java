package com.yi.costume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CostumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumeApplication.class, args);
    }

}

