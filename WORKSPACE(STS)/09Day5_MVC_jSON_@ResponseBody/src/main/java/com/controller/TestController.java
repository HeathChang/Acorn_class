package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Login;

@Controller
public class TestController {
	@RequestMapping("/aaa") 
	public  String aaa(@RequestBody Login login) { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		System.out.println(login);
		return "hello"; //hello.jsp 응답메세지 전송
	}
	
	
	@RequestMapping("/bbb")
	public  String bbb(@RequestBody ArrayList<Login>list) { //위치 조심
		System.out.println(list);
		return "hello";
	
	}
	
}
