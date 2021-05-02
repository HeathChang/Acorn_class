package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginForm";		
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto) {
		System.out.println(dto.getUserid()+"\t"+ dto.getPasswd());
		System.out.println(dto);
		return "loginForm";		
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(String[] chk) {
		
	//	System.out.println(chk);
		for (String s : chk) {
			System.out.println(s);
		}
		return "login";		
	}


}
