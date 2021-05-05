package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출 됨 =======================");
		return "main";  //main.jsp
	}
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa 호출 됨 =======================");
		return "main";  //main.jsp
	}

}
