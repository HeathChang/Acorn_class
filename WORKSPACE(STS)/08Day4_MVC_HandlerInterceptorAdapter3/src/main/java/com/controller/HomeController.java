package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String main() {
		System.out.println("HomeController.main 호출");
		return "main";
	}
	//main이나 home 요청시, intercepter로 인해 preHandle → null이기 때문에, loginForm 이동 -> form 작성후, /login으로 이동해 setAttribute("login") 한다. 이후 logined이동해 정보 제공
}
