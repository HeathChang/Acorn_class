package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	//1.리턴되는 객체에 xxx키값을 부여함, 이 객체를 다른 함수에서 사용 가능
	@ModelAttribute("xxx")
	public ArrayList<String>getList(){ 
		System.out.println("getList()=========================");
		ArrayList <String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list; //jsp페이지가 아니고 list를 xxx키 값으로 리턴
	}
	
	@RequestMapping(value = "/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) { //xxx리스트를 매개변수로 받아서 사용 
		System.out.println("aaa추가 요청");
		list.add("aaaa");
		return "main";
	}
	//model http에 key값 설정
	@RequestMapping(value = "/bbb")
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) { //xxx리스트를 매개변수로 받아서 사용 
		System.out.println("bbb추가 요청");
		list.add("bbb");
		return "main2";
	}
	//model http에 key값 설정

	
	
	
}
