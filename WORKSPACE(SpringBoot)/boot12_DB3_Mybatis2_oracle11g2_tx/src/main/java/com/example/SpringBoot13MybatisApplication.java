package com.example;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dto.DeptDTO;
import com.example.service.DeptService;

@SpringBootApplication
public class SpringBoot13MybatisApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBoot13MybatisApplication.class, args);
		
		DeptService service = ctx.getBean("deptService", DeptService.class);

		//트랜잭션 실습
		try {	
			service.tx();
		}catch(Exception e) {
			System.out.println("트랜잭션 실습 에러: >>>>>>>>>" + e.getMessage());
		}
		
		ArrayList<DeptDTO> list = service.select();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
