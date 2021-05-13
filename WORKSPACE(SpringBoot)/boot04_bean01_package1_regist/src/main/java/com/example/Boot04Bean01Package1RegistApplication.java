package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.service.DBService;


//다른 패키지에 있으면, 명시적으로 @ComponentScan 설정 (혹은 scanBasePackages 사용)

//@SpringBootApplication (scanBasePackages="com.*")
@SpringBootApplication
@ComponentScan(value="com.*")
public class Boot04Bean01Package1RegistApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Boot04Bean01Package1RegistApplication.class, args);
		DBService service =ctx.getBean("myService",DBService.class);
		System.out.println(">>>>>"+service.getList());;
	}

}
