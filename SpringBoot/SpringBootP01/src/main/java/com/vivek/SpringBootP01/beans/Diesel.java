package com.vivek.SpringBootP01.beans;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Engine {
    Diesel(){
        System.out.println("Diesel class started.....");
    }
    public void start(){
        System.out.println("Diesel Engine started......");
    }
}
