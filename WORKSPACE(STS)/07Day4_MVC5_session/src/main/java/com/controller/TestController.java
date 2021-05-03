package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("login get방식 요청");
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) { // 매개변수로 세션 직접 받음
		System.out.println("login session설정==== " + dto);
		session.setAttribute("login", dto);
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login"; // login.jsp 페이지 요청이 아닌 / login.get 방식 다시 요청

	}

}
