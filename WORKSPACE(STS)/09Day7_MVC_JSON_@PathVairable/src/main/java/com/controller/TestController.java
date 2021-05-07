package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("test=====================");
		return "main";//main.jsp
	}
	
	@RequestMapping(value="/board/name/{xxx}", method = RequestMethod.GET)
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println("aaa @PathVariable(\"xxx\")=="+ name);
		return "main";//main.jsp
	}
	@RequestMapping(value="/board2/name/{xxx}/age/{yyy}", method = RequestMethod.GET)
	public String aaa2(@PathVariable("xxx") String name,
			@PathVariable("yyy") int age) {
		System.out.println("aaa2 @PathVariable(\"xxx\")=="+ name+ "\t"+age);
		return "main";
	}
	
}
