package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;
import com.service.MemberSerivce;

@Controller
public class MemberController {
	@Autowired
	MemberSerivce service;
	
	@RequestMapping(value = "/loginCheck/myPage")//interceptor먼저 거쳐서옴
	public String myPage(HttpSession session) {
		
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid= dto.getUserid();  //세션에서 id 얻기 
		dto= service.myPage(userid);
		session.setAttribute("login", dto);
		return "redirect:../myPage"; //주소에 해당하는 페이지를  servlet-context에등록사용
		//return "myPage"; //주소에 해당하는 페이지를  servlet-context에등록사용
	}
	
	
	
	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO m,Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공");
		return "main";
	}
}
