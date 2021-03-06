package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberSerivce;

@Controller
public class MemberController {
	@Autowired
	MemberSerivce service;

	@RequestMapping(value = "/loginCheck/myPage") // interceptor먼저 거쳐서옴
	public String myPage(HttpSession session) {

		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid(); // 세션에서 id 얻기
		dto = service.myPage(userid);
		session.setAttribute("login", dto);
		return "redirect:../myPage"; // 주소에 해당하는 페이지를 servlet-context에등록사용
		// return "myPage"; //주소에 해당하는 페이지를 servlet-context에등록사용
	}

	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공");
		return "main";
	}

	@RequestMapping(value = "/idDuplicateCheck",produces = "text/html; charset=UTF-8")
	public @ResponseBody String idDuplicateCheck(@RequestParam("id") String userid) {
		MemberDTO dto = service.myPage(userid);
		System.out.println("idDuplicateCheck: " + userid);
		System.out.println("dto: "+dto);
		String mesg = "아이디 사용가능";
		if (dto != null) {
			mesg = "아이디 중복";
		}
		return mesg;
	}
}
