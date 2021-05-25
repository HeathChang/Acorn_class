package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.Login;

@Controller  // @RestController = @Controller + @ResponseBody
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}

	@RequestMapping("/aaa")
	@ResponseBody
	public Login aaa() {//JSON으로 변환 전달 
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	//////////////////////////////////////////

	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb() {
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍기동1", "20"));
		list.add(new Login("홍기동2", "30"));
		list.add(new Login("홍기동3", "40"));
		return list;
	}
	
	
	
	
	

	@RequestMapping("/ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> cccc() {
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍기동1", "20"));
		list.add(new Login("홍기동2", "30"));
		list.add(new Login("홍기동3", "40"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1", "20"));
		list2.add(new Login("유관순2", "30"));
		list2.add(new Login("유관순3", "40"));

		map.put("one", list);
		map.put("two", list2);
		return map;
	}
}
