package com.example.configotherclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigOtherClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigOtherClient2Application.class, args);
    }
}
