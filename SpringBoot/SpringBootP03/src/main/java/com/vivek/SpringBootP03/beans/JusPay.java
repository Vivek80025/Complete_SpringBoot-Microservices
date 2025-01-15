package com.vivek.SpringBootP03.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JusPay implements Partners{
    public JusPay(){
        System.out.println("JusPay constructor....");
    }
    public void payment(String amount){
        System.out.println("payment done for "+amount+" by JusPay");
    }
}
