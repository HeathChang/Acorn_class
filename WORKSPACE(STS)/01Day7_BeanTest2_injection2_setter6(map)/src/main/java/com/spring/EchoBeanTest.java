package com.spring;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echoRef=ctx.getBean("echoBean",EchoBean.class);
		Map<String,AnotherBean> map=echoRef.getMap();
		Set<String> keys =map.keySet();
		for (String k : keys) {
			System.out.println(map.get(k).getName()+"\t"+map.get(k).getAge());
		}
	
	}

}
