package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("classpath:Configuration.xml");
		EchoBean echo=ctx.getBean("EchoBean",EchoBean.class);
		System.out.println("echo.getValueList()====="+echo.getValueList());
		echo.getAnotherBean().getInfo();
	}

}
