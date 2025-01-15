package com.vivek.Welcome_API.controller;

import com.vivek.Welcome_API.config.CommConfig;
import com.vivek.Welcome_API.repo.GreetApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

//    @Autowired
//    RestTemplate  restTemplate;

    @Autowired
    GreetApiClient greetApiClient;

    @Autowired
    Environment environment;

    @GetMapping("/welcome")
    public String welcome(){

//        String res = restTemplate.getForObject("http://localhost:8080/greet", String.class);

        String port = environment.getProperty("server.port");

        String res = greetApiClient.invokeGreetApi();
        return res+" Welcome to my life"+"("+port+")";
    }
}
