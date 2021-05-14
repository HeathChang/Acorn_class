package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dao.DBOracleDAO;
import com.example.service.DBOracleService;

@Configuration//configuration.xml 역할 
public class JavaConfig {
	@Bean   //리턴되는 dao가 컨테이너에 등록 
	public DBOracleDAO dao() {//함수이름이 id가 됨 <bean id="dao" class="DBOracle" />
		return new DBOracleDAO();
	}
	
	@Bean("myService")//id 
	public DBOracleService service() {//Main에서 사용 할 servcie빈 
		return new DBOracleService(dao());//<bean id="myService" class="OracleService">
		//<const-args name="생성자이름"  ref="dao" /> 
		//생성자를 이용한 강제 주입 
	}
}
