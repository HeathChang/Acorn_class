package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dto.User;

@SpringBootApplication
public class Boot08ExternalizeConfig1ValueApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=
				SpringApplication.run(Boot08ExternalizeConfig1ValueApplication.class, args);
		User user= ctx.getBean("myUser", User.class);
		System.out.println(user);
		
	}

}
