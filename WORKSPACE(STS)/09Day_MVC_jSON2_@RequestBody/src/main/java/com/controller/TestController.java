package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller
public class TestController {

	@RequestMapping("/ddd") // 주소요청
	public @ResponseBody String ddd() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		return "hello"; //기존 뷰페이지 hello.jsp 가 아닌 "hello" 문자열 자체를 리턴해줌 
	}
	@RequestMapping("/aaa") // 주소요청
	public @ResponseBody Login aaa() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		Login login= new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	@RequestMapping("/bbb") // 주소요청
	public @ResponseBody ArrayList<Login> bbb() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1","10"));
		list.add(new Login("홍길동2","20"));
		list.add(new Login("홍길동3","30"));
		list.add(new Login("홍길동4","40"));
		return list;
	}
	@RequestMapping("/ccc") // 주소요청
	public @ResponseBody HashMap<String, ArrayList<Login>> ccc() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list1 = new ArrayList<Login>();
		list1.add(new Login("홍길동1","10"));
		list1.add(new Login("홍길동2","20"));
		list1.add(new Login("홍길동3","30"));
		
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1","1"));
		list2.add(new Login("유관순2","2"));
		list2.add(new Login("유관순3","3"));
		
		map.put("one",list1);
		map.put("two",list2);
		
		return map;
	}
	
	
}
