package com.example.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Login;

@RestController // @Controller + @ResponseBody
public class TestController {

	@RequestMapping("/aaa")
	public Login aaa() {
		Login dto = new Login("asdf", "1234");
		return dto;
	}

	
	
	@RequestMapping("/bbb")
	public ArrayList<Login> bbb() {
		Login dto = new Login("asdf", "1234");
		Login dto2 = new Login("eeee", "999");
		Login dto3 = new Login("gsfasf", "777");
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		return list;
	}
	
	

	@RequestMapping(value = "/ccc", produces = "text/plain;charset=UTF-8")
	public String ccc() {

		return "홍길동";
	}

	@RequestMapping(value = "/ddd", produces = "text/html;charset=UTF-8")
	public String ddd() {
		String mesg = "<html><body><h1>Hello,안녕하세요</h1></body></html>";
		return mesg;
	}

	@RequestMapping(value = "/eee", produces = "text/xml;charset=UTF-8")
	public String eee() {
		String mesg = "<person><name>홍길동</name><age>20</age></person>";
		return mesg;
	}


}
