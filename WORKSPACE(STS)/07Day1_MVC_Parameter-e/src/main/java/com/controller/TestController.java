package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("POST 요청=======");
		return "loginForm";
	}
	//중요
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String loginForm(LoginDTO dto) {
		System.out.println("LoginDTO 요청=======" +dto);
		return "loginForm";
	}
	
	///login2 lognForm.jsp 수정
	@RequestMapping(value = "/login2")
	public String login2(@RequestParam("userid")String userid, @RequestParam("passwd")String passwd) {
		System.out.println("@RequestParam(\"userid\"): " +userid+"\t"+"@RequestParam(\"passwd\"): "+passwd);
		return "login";
	}
	@RequestMapping(value = "/login3")
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.println("@RequestParam(\"userid\"): " +userid+"\t"+"@RequestParam(\"passwd\"): "+passwd);
		return "login";
	}
	@RequestMapping(value = "/login4")
	public String login4(String userid, String passwd) {
		System.out.println("@RequestParam(\"userid\"): " +userid+"\t"+"@RequestParam(\"passwd\"): "+passwd);
		return "loginForm";
	}
	
	//값중 하나라도 없을경우, 405 에러 발생시 아래같이 회피함. 
	@RequestMapping(value = "/login5")
	public String login5(@RequestParam(required = false, defaultValue = "홍길동")String xxx, String passwd) {
		System.out.println("@RequestParam(\"userid\"): " +xxx+"\t"+"@RequestParam(\"passwd\"): "+passwd);
		return "login";
	}
	
	//값중 하나라도 없을경우, 405 에러 발생시 아래같이 회피함. 
	@RequestMapping(value = "/login6")
	public String login5(@RequestParam Map<String, String> m) {
		System.out.println("@RequestParam Map: "+m);
		return "login";
	}

	
	
	
}
