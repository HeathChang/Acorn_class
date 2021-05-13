package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.MemberDTO;
import com.member.service.MemberService;

@Controller
public class MainController {
	@Autowired
	MemberService service;
	@Autowired
	BCryptPasswordEncoder pwdEncoder;

	@RequestMapping("/")
	public String main() {
		System.out.println("main==========");
		return "login";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		System.out.println("main.register()==========");
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register2(MemberDTO dto) {
		System.out.println("main.register2()=========="+dto);
		String inputPass=dto.getPassword(); //암호화전
		String crytPass = pwdEncoder.encode(inputPass); //기전 패스워드를 암호화 후 변수에저장
		dto.setPassword(crytPass); //dto에 암호화 패스워드 저장
		int num = service.register(dto); //db에 insert
		System.out.println("register: "+num);
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(MemberDTO dto) {
		System.out.println("main.login()=========="+dto);
		MemberDTO dbDTO=service.login(dto.getId()); //id로 db에서 회원정보 가져오기
		String dbPassword=dbDTO.getPassword();
		System.out.println("dbPassword: "+dbPassword);
		boolean pwdEqual=pwdEncoder.matches(dto.getPassword(), dbDTO.getPassword());
		//입력된 비밀번호, 암호화된 비밀번호
		System.out.println("패스워드 비교결과: "+pwdEqual);
		String nextPage="login";
		if(pwdEqual) nextPage="join"; //패스워드 같으면 join
		return nextPage;
		
	}
	
	
}
