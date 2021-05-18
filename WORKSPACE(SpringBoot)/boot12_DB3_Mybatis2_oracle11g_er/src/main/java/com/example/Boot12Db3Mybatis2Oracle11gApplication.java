package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dto.Dept;
import com.example.service.DBOracleService;
import com.example.service.DBService;

@SpringBootApplication
public class Boot12Db3Mybatis2Oracle11gApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(Boot12Db3Mybatis2Oracle11gApplication.class, args);
				DBService service= ctx.getBean("myService", DBOracleService.class);
				
				int num = service.insert(new Dept(81,"서울" ,"개발"));
				System.out.println("삽입: "+num);

				int num2 = service.update(new Dept(81,"서울2" ,"개발2"));
				System.out.println("변경: "+num2);

				int num3 = service.deleteByDeptno(81);
				System.out.println("삭제: "+num3);
				
				List<Dept> list =service.list();
				for (Dept dept : list) {
					System.out.println(dept);
				}
	
	}

}
