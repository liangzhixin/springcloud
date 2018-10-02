package com.example.consulconsumerfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consul-client")
public interface DcClient {

    @GetMapping("/dc")
    String dc();
}
