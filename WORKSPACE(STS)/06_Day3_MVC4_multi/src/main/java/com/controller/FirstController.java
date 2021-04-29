package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/kkk3")
	public String xxx() {
		System.out.println("Second 호출===");
		return "/WEB-INF/views/home.jsp";
	}
}
