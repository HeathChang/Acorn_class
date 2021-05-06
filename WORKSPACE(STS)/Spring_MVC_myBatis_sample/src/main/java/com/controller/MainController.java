package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.member.service.MemberService;

@Controller
public class MainController {
	@Autowired
	MemberService service;
	
	@RequestMapping("/list")
	public void list(Model m) {   //list.jsp
		System.out.println("list()=================");
		List<DeptDTO> list=service.list();//dept 리스트 얻기 
		m.addAttribute("list", list);
		//return "list";//list.jsp   //void 여서 주소가 뷰페이지이름이 됨
	}
	
}
