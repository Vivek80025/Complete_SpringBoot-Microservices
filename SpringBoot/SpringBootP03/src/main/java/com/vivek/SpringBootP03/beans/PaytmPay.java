package com.vivek.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class PaytmPay implements Partners{
    public PaytmPay(){
        System.out.println("PaytmPay constructor....");
    }
    public void payment(String amount){
        System.out.println("payment done for "+amount+" by PaytmPay");
    }
}
