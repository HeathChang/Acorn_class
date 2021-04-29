package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("get 요청");
		return "loginForm";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login() {
		System.out.println("Post 요청");
		return "login";
	}
	
	
}
