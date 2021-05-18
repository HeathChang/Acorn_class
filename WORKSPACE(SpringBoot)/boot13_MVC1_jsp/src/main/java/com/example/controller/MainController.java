package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/") //get요청만 처리
	public String main() {
		System.out.println("main호출================");
		return "main";
	}
}
