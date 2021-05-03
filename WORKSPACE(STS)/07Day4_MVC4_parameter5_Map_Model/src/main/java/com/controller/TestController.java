package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String xxx(Model m) { //model 객체 aoroqustnfh qkerl
		//request.setAtt key/val 동일
		// ModelAndVIew는 직접 객체 생성후 add,view 설정후 리턴
		m.addAttribute("username","홍길동");
		return "main";
	}
	//model http에 key값 설정
	@RequestMapping(value = "/bbb")
	public String bbb(Map<String,String> map) { 
		map.put("address","서울");
		return "main2";
	}
	//model http에 key값 설정

	
	
	
}
