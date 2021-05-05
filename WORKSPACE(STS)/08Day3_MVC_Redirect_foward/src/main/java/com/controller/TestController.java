package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main===============");
		return "main";
	}
	//1. redirect시 request.getParameter("userid") //파라미터로 데이터 전송됨 setAttribute 사용안됨 
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(Model m,HttpServletRequest request) { // 매개변수로 세션 직접 받음
		System.out.println("redirect호출==============");
		m.addAttribute("userid","홍길동");
		request.setAttribute("passwd", "1234");
		//model에 담으면, view에서만 사용 가능 , request에 담으면 어디서든 사용 가능 . 
		return "redirect:main?";
	}
	//2. forwadrd시 request.getAttribute("userid") 가능
	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public String forward(Model m,HttpServletRequest request) { // 매개변수로 세션 직접 받음
		System.out.println("forward호출==============");
		m.addAttribute("userid","홍길동");
		request.setAttribute("passwd", "1234");
		return "forward:main?";
	}
	

}
