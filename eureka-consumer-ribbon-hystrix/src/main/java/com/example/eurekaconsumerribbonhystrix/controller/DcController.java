package com.example.eurekaconsumerribbonhystrix.controller;

import com.example.eurekaconsumerribbonhystrix.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/dc")
    public String dc(){
        for (int i=0;i<50;i++) {
            consumerService.dc();
        };
        return "success";
    }

}
