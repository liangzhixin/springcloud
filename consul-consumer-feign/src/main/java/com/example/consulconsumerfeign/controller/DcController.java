package com.example.consulconsumerfeign.controller;

import com.example.consulconsumerfeign.client.DcClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/dc")
    public String dc(){
        log.info("调用consul-client的dc接口");
        return dcClient.dc();
    }
}
