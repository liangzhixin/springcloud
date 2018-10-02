package com.example.consulconsumerribbon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class DcController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dc")
    public String dc(){
        log.info("调用consul-client的dc接口");
        return restTemplate.getForObject("http://consul-client/dc",String.class);
    }
}
