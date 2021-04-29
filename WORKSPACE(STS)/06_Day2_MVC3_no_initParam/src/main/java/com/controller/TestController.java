package com.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	@RequestMapping("/kkk")
	public String tt() {
		System.out.println("tt함수 실행");
		return "/WEB-INF/views/hello.jsp";
	}
}
