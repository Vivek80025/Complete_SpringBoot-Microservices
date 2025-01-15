package com.vivek.SSP03_DB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/admin")
    public String admin(){
        return "mai admin hoo";
    }

    @GetMapping("/user")
    public String user(){
        return "mai admin ya user hoo";
    }
}
