package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main===============");
		return "main";
	}

	// 2. redirect-flash: servlet-context에 annotation driven 필요
	//request.getAttribute만 사용 가능. 
	@RequestMapping(value = "/flash", method = RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {
		System.out.println("redirectFlash 호출==============");
		m.addFlashAttribute("userid", "홍길동");
		m.addFlashAttribute("passwd", "1234");
		return "redirect:main";
	}

}
