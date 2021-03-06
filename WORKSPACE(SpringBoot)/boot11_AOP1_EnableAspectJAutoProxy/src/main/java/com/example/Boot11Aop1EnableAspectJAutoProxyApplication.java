package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.service.TargetService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Boot11Aop1EnableAspectJAutoProxyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Boot11Aop1EnableAspectJAutoProxyApplication.class, args);
		TargetService service= ctx.getBean("myService", TargetService.class);
		String mesg= service.sayEcho("홍길동", 20);
		System.out.println("main  >>>>>>>> "+ mesg);
		service.aaa();
		
	}

}
