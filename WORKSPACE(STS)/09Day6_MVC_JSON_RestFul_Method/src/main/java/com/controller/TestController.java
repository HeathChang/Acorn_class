package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	@RequestMapping(value="/board", method=RequestMethod.GET) 
	public  String get() {
		System.out.println("get=========");
		return "main";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.POST) 
	public  String post() {
		System.out.println("post=========");
		return "main";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.DELETE) 
	public  String delete() {
		System.out.println("DELETE=========");
		return "main"; 
	}
	
	@RequestMapping(value="/board", method=RequestMethod.PUT) 
	public  String put() {
		System.out.println("PUT=========");
		return "main"; 
	}
	
	

}
