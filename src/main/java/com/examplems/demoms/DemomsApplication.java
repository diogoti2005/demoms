package com.examplems.demoms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class DemomsApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(DemomsApplication.class, args);
    }

}
