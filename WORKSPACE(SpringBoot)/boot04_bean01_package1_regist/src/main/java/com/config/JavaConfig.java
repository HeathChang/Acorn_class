package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.DBService;


//필요한 빈은 @Bean 생성후 등록
@Configuration //xml 역할 
public class JavaConfig {
	@Bean("myService") //컨테이너 id="myService"로 빈등록   
	public DBService service() { //bean id ="myService" class="DBService"
		return new DBService();
	}
}
