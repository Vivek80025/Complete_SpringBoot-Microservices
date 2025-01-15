package com.vivek.SpringBootP01;

import com.vivek.SpringBootP01.beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootP01Application.class, args);
		Car car = context.getBean(Car.class);
		car.m1();
	}

}
