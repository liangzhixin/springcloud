package com.example.eurekaconsumerribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String dc(){
        log.info(">>>>>调用eureka-client的dc接口");
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }

    public String fallback(){
        log.info(">>>>>Hystrix服务降级调用fallback");
        return "hello world!";
    }
}
