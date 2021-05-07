package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
@RestController //모든 애들이 @ResponseBody 자동으로 붙여줌 
public class TestController {

	@RequestMapping("/ddd") // 주소요청
	public ResponseEntity<Login> ddd() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		Login login= new Login("윤동주","20");
		ResponseEntity<Login>entity= ResponseEntity.status(200).body(login);
		return entity;
	}
	
	@RequestMapping("/aaa") // 주소요청 && 위에 RestController 있기 때문에, @ResponseBody없어도됨
	public  Login aaa() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		Login login= new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	
	@RequestMapping("/bbb") // 주소요청 && @ResponseBody없어도됨
	public  ArrayList<Login> bbb() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1","10"));
		list.add(new Login("홍길동2","20"));
		list.add(new Login("홍길동3","30"));
		list.add(new Login("홍길동4","40"));
		return list;
	}
	@RequestMapping("/ccc") // 주소요청 && @ResponseBody없어도됨
	public  HashMap<String, ArrayList<Login>> ccc() { //비동기 처리 // 문자열을 뷰페이지가 아닌, body 통해서 보내줌
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
