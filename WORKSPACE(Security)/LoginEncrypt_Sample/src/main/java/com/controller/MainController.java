package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.MemberDTO;
import com.member.service.MemberService;

@Controller
public class MainController {
	@Autowired
	MemberService service;
	@Autowired
	BCryptPasswordEncoder pwdEncoder;

	@RequestMapping("/")
	public String main() {
		System.out.println("main==========");
		return "login";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		System.out.println("main.register()==========");
		return "register";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(MemberDTO dto) {
		System.out.println("main.register()==========");
		return "register"; //여기까지함...
	}
	
	
}
