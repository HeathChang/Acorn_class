package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("echo.xml");
		EchoBean echo1=ctx.getBean("echoBean",EchoBean.class);
		EchoBean echo2=ctx.getBean("echoBean",EchoBean.class);
		System.out.println("echo1: "+echo1.toString());
		System.out.println("echo1.getAnotherBean().getInfo(): "+echo1.getAnotherBean().getInfo());

		System.out.println("echo1==echo2:" +(echo1==echo2)); //false(prototype)
		System.out.println("echo1.getAnotherBean():==echo2.getAnotherBean():" +(echo1.getAnotherBean()==echo2.getAnotherBean())); //true: ~의 결과값 동일 
		
	
	}

}
