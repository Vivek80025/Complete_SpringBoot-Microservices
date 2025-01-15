package com.vivek.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
    public Flipkart(){
        System.out.println("Flipkart constructor....");
    }
    @Autowired
    //@Qualifier("jusPay")
    Partners pt;

    @Value("${jdbc.url}")
    private String url;

    public void paymentGateWay(String amount){
        System.out.println(url);
        pt.payment(amount);
    }
}
