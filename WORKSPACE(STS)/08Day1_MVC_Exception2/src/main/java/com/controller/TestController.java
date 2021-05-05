package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/aaa")
	public String xxx() {
		if(true) throw new ArithmeticException("Arithmetic Exception 생성 ==========");
		return "main";
	}

	@RequestMapping(value = "/bbb")
	public String bbb() { // 매개변수로 세션 직접 받음
		if(true) throw new NullPointerException("Nullpoint Exception 생성 ==========");
		return "main";
	}
	
//servlet-context.xml에 bean: property 추가
}
