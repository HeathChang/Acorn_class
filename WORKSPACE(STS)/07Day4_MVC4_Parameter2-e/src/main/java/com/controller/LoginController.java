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
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm==========");
		return "loginForm";
	}

	// 추천 X
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("login1.post=============" + dto);
		// 이름 없는 상태임, request,session 데이털ㄹ set을 안함
		// Model 클래스로 자동 파싱, 자동 request에 set, get 키값은 소문자로 시작하는 클래스 이름이 됨.
		// 키 값은 loginDTO
		return "login1"; // login1.jsp
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println("login1.post=============" + dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", dto); // key값이 login
		mav.setViewName("login2");
		return mav;
	}

	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) { // dto키값을 xxx지정
		System.out.println("login3.post=============" + dto);
		// requset.setAttribute("xxx",dto) //key는 xxx
		return "login3";
	}

	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(Model m, LoginDTO dto) { // model=request
		System.out.println("login4.post=============" + dto);
		m.addAttribute("xxx", dto);
		return "login4";
	}
	@RequestMapping(value = "/login5", method = RequestMethod.POST)
	public String login4(HttpServletRequest req, LoginDTO dto) { // model=request
		System.out.println("login5.post=============" + dto);
		req.setAttribute("xxx", dto);
		return "login5";
	}
}