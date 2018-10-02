package com.example.configclient2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Slf4j
public class HelloController {

    @Value("${lzx.name}")
    private String name;

    @Value("${lzx.age}")
    private String age;

    @Value("${lzx.gender}")
    private String gender;

    @Value("${test.name}")
    private String testName;

    @GetMapping("/hello")
    public String hello(){
        log.info(name + ":" + age + ":" + gender);
        return testName;
    }
}
