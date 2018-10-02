package com.example.consulconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class DcContrller {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dc")
    public String dc(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-client");
        String url = "http://" + serviceInstance.getHost() + ":" +serviceInstance.getPort() + "/dc";
        log.info(url);
        return restTemplate.getForObject(url,String.class);
    }
}
