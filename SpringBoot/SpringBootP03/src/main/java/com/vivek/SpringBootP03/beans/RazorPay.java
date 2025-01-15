package com.vivek.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class RazorPay implements Partners{
    public RazorPay(){
        System.out.println("RazorPay constructor....");
    }
    public void payment(String amount) {
        System.out.println("payment done for "+amount+" by RazorPay");
    }
}
