package com.vivek.SpringBootP01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("vivek")-->Car class ka spring bean ka name vivek hai & by default s.b name car
@Component
public class Car {
    //field D.I
    //byType
    @Autowired
    //@Qualifier("petrol")
    Engine engine;
    public void m1(){
        engine.start();
    }
}
