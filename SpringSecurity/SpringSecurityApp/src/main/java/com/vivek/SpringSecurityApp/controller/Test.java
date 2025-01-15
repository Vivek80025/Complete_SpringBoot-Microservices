package com.vivek.SpringSecurityApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

   /* @GetMapping("/quiz")
    public String m1(){
        return "start-quiz";
    }

    @GetMapping("/login")
    public String m2(){
        return "login";
    }  */

    //HDFC bank website
    //I want to add security only on checkBalance and transfer

    @GetMapping("/contact")
    public String contact(){
        return "Phn no.:9310165706";
    }

    @GetMapping("/update")
    public String update(){
        return "car loan interest drop uptu 2%";
    }

    @GetMapping("/balance")
    public String checkBalance(){
        return "100000";
    }

    @GetMapping("/transfer")
    public String moneyTransfer(){
        return "money transfer successful";
    }


}
