package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("TestController.main 호출 됨 =======================");
		return "main";  //main.jsp
	}
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm 호출 됨 =======================");
		return "loginForm";  //main.jsp
	}


}
