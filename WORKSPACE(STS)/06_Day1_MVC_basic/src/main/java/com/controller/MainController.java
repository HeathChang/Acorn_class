package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa() 호출=================");
		return "home";
	}
}
