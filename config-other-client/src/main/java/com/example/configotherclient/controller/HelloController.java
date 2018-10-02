package com.example.configotherclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello(){
        log.info(">>>>>hello");
        return profile;
    }
}
