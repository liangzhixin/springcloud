package com.example.configotherclient2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Value("${lzx.name}")
    private String name;

    @Value("${lzx.age}")
    private String age;

    @Value("${lzx.gender}")
    private String gender;

    @GetMapping("/hello")
    public String hello(){
        log.info(">>>>>hello");
        return name + ":" + age + ":" + gender;
    }
}
