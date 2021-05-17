package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DBService;

@SpringBootApplication
public class Boot07LifeCycleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=
				SpringApplication.run(Boot07LifeCycleApplication.class, args);
		DBService service= ctx.getBean("myService", DBService.class);
		System.out.println(service.getList());
		
	}

}
