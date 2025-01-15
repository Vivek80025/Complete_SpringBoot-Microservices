package com.vivek.SpringBootP01.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Petrol implements Engine{
    Petrol(){
        System.out.println("Petrol class started");
    }
    public void start(){
        System.out.println("petrol Engine started......");
    }
}
