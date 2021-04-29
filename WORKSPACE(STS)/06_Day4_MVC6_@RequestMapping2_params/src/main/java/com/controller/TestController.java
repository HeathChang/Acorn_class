package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main() {
		System.out.println("TestController");
		return "login";
	}
	@RequestMapping(value = "/login")
	public String loginForm() {
		System.out.println("/login");
		return "login";
	}
	@RequestMapping(value = "/login",params="aaa=bbb")
	public String loginFormaabb() {
		System.out.println("/login?aaa=bbbbb =========");
		return "login";
	}
	@RequestMapping(value = "/login",params="aaa")
	public String loginFormaaa() {
		System.out.println("/login?aaa =========");
		return "login";
	}
	@RequestMapping(value = "/login",method=RequestMethod.GET,params="kkk=b")
	public String loginFormGetkkkb() {
		System.out.println("/login?Get.kkk=b =========");
		return "login";
	}
}
