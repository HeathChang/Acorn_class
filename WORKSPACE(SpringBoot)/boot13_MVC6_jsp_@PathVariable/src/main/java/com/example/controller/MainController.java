package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {		
		System.out.println("/ ==================");
		return "main";
	}
	@GetMapping("/board/name/{xxx}")
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println(name);
		return "main";
	}
	@GetMapping("/board2/name/{xxx}/age/{yyy}")
	public String bbb(@PathVariable("xxx") String name, @PathVariable("yyy") int age) {
		System.out.println(name + "\t"+ age);
		return "main";
	}


}
