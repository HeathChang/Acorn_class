package com.controller;

import java.util.ArrayList;

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
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String xxx3(ArrayList<String> list) {
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return "main3";
	}
	@RequestMapping(value = "/ccc2", method = RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) { //request key xxx 사용 권장
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		//request.setAttribute("xxx",list)와 동일
		
		return "main2";
	}
	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) { //request key xxx 사용 권장
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav= new ModelAndView();
		mav.addObject("list",list); //key값은 list
		mav.setViewName("main"); //main.jsp가 list 키값
		
		return mav;
	}
	//model http에 key값 설정

	
	
	
}
