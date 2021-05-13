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
	@Autowired  //암호화 기능 api추가  spring-security.xml참조
	BCryptPasswordEncoder pwdEncoder;
	
	@RequestMapping("/")
	public String main() {
		System.out.println("main=================");
		return "login";//login.jsp
	}
		
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {//회원등록 페이지 요청 
		System.out.println("main.register=====   ");		
		return "register";//register.jsp
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)//회원가입
	public String register2(MemberDTO dto) {
		System.out.println("main.register2.post=====   "+ dto);		
		String inputPass= dto.getPassword(); //암호화전 			
		String crytPass= pwdEncoder.encode(inputPass);//기존패스워드를 암호화 후 변수에 저장		
		dto.setPassword(crytPass);  //dto에 암호화 패스워드 저장		
		int num= service.register(dto); //db에 insert 
		System.out.println("resigter======"+ num);
		return "login";   //login.jsp 
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberDTO dto) {  //로그인 인증 
		System.out.println("main.login.post=====   "+ dto);
		MemberDTO dbDTO= service.login(dto.getId());//id로 db에서 회원정보 가져오기
		String dbPassword= dbDTO.getPassword();//암호화 된 패스워드
		System.out.println("dbPassword====="+ dbPassword);
		boolean pwdEqual= pwdEncoder.matches( dto.getPassword(),dbDTO.getPassword());
		//입력된 비밀번호/ 암호화된 비밀번호순  true/false 리턴 
		System.out.println("패스워드 비교결과"+ pwdEqual);
		String nextPage="login";  //login.jsp
		if(pwdEqual) nextPage="join";  //패스워드가 같으면 join.jsp
		return nextPage;
	}
	
	
	


	
	
	
	
	
	
	
	

}
