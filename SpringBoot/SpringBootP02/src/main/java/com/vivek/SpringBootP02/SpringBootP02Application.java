package com.vivek.SpringBootP02;

import com.vivek.SpringBootP02.beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP02Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootP02Application.class, args);
		Instagram insta = context.getBean(Instagram.class);
		insta.play();
	}

}
