package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	  @RequestMapping(value = "/login", method = RequestMethod.POST) 
	  public ModelAndView login(String userid, String passwd, HttpSession session
			  ) {
	  System.out.println("TestController.login호출 됨 =======================");
	  session.setAttribute("login", userid);
	  ModelAndView mav= new ModelAndView();
	  mav.addObject("userid", userid);
	  mav.addObject("passwd", passwd);
	  mav.setViewName("logined");//logined.jsp  	  
	  return mav;	  
	  }
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("TestController.main 호출 됨 =======================");
		return "main";
	}
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm호출 됨 =======================");
		return "loginForm";
	}
	
	
	 

}
