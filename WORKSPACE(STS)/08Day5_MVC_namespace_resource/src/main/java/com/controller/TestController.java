package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
	//main요청은 직접 main.jsp로 지정
	@RequestMapping("/aaa")
	public String main() {
		return "main";
	}
}
