package com.example.eurekaconsumerribbon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/dc")
    public String dc(){
        log.info("调用eureka-client的dc接口");
        return restTemplate.getForObject("http://eureka-client/dc/",String.class);
    }
}
