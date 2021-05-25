package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.Login;

@Controller  // @RestController = @Controller + @ResponseBody
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/zzz")
	public @ResponseBody String zzz(@RequestParam String userid, @RequestParam String passwd ) {
		
		System.out.println(userid+"\t"+passwd);
		return "hello";
	}
	
	@RequestMapping("/bbb")
	public @ResponseBody String xxx3(@RequestBody ArrayList<Login> list) {
		
		System.out.println(list);
		return "hello";
	}
	
	
	
	
	
	
	
	
	
	//@CrossOrigin
	
	
	@RequestMapping("/aaa")
	public @ResponseBody String xxx2(@RequestBody Login dto) {		
		System.out.println(dto);
		return "hello";//hello 문자열을 응답으로 보내줌 
	}
	
	
	
	
	

}
