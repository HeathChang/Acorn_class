package com.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
	@RequestMapping(value="/header") //get,post 방식 둘다 처리
	public String xxx(HttpServletRequest request) {
		Enumeration<String> keys=request.getHeaderNames();
		while(keys.hasMoreElements()) {
			String key =(String)keys.nextElement();
			String value=request.getHeader(key);
			System.out.println(key+"\t"+value);
		}
		return "hello";
	}
}
