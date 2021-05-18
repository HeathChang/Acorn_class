package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dto.Dept;
import com.example.service.DBOracleService;

@SpringBootApplication
public class Boot12Db3Mybatis2Oracle11gApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Boot12Db3Mybatis2Oracle11gApplication.class, args);
	DBOracleService service = ctx.getBean("myService", DBOracleService.class);
		//1. 저장
		int num = service.insert(new Dept(88, "개발", "서울"));
		System.out.println("삽입: "+num);
		
		//2. 수정
		int num2 = service.update(new Dept(88, "개발2", "서울2"));
		System.out.println("변경: "+num2);
		
		//3. 삭제
		int num3 = service.deleteByDeptno(88);
		System.out.println("삭제: "+num3);
			
		List<Dept> list = service.list();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
