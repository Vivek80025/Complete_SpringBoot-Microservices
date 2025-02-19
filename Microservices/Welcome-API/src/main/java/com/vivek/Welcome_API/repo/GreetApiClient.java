package com.vivek.Welcome_API.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-MICROSERVICES")
public interface GreetApiClient {

    @GetMapping("/greet")
    public String invokeGreetApi();
}
