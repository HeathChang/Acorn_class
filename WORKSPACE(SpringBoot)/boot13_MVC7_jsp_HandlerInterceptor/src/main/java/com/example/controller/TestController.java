package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/zzz")
	public String zzz() {
		return "main";
	}	
	@RequestMapping("/xyz")
	public String xyz() {
		return "main";
	}
	// Interceptor 미적용
	@RequestMapping("/")
	public String xxx() {
		return "main";
	}
	
	// Interceptor 적용
	@RequestMapping("/login")
	public String login() {
		return "main";
	}


}
