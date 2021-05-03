package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm============");
		return "loginForm"; //loginForm.jsp
	}
	
	
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("login1.post============"+ dto);
		//이름이 없는 상태임, request, session에 데이터를 set을 안함. 
		//Model클래스로 자동 파싱,  자동 request에  set, get의 키값은 소문자로 시작하는 클래스이름이 됨.
		//키 값은 loginDTO
		return "login1"; //login1.jsp
	}
	
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println("login2.mav============"+ dto);
		ModelAndView mav= new ModelAndView();
		mav.addObject("login", dto);   //request에서 key 값이  login가 됨
		mav.setViewName("login2");   // views/login2.jsp   el, request.getAttribute 
		return mav;		
	}
	
	
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) {//dto의 키값을 xxx로 설정
		System.out.println("login3.post============"+ dto);
		//request.setAtttribute("xxx", dto);  //key는 xxx
		return "login3"; //login3.jsp
	}
	
	
	
	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(Model m,  LoginDTO dto) {//Model = request다 .
		System.out.println("login4.post============"+ dto);
		//이름이 없는 상태임
		m.addAttribute("xxx", dto);  //setAttribute 아님 
		return "login3"; //login3.jsp
	}
	
	@RequestMapping(value = "/login5", method = RequestMethod.POST)
	public String login5(HttpServletRequest req,  LoginDTO dto) {
		System.out.println("login5.post============"+ dto);
		//m.addAttribute("xxx", dto);
		req.setAttribute("xxx", dto);//xxx  
		return "login3"; //login3.jsp
	}
	
	
	
}
