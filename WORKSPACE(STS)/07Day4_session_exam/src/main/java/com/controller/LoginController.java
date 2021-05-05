package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";// main.jsp
	}

	// 회원가입하기 누를시 (로그인 화면에서 버튼 )
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberJoin() {
		System.out.println("/member get=======");
		return "memberForm"; // memberForm.jsp
	}

	// 회원가입 클릭시 (정보입력후), 이곳으로 이동하여 member로 dto저장
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String memberJoin(LoginDTO dto, HttpSession session) {
		System.out.println("/member Post=======" + dto);
		session.setAttribute("member", dto);
		return "redirect:login"; // /login get방식 다시 요청
	}

	// 로그인하기 누를시
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("/login get=======");
		return "loginForm"; // loginForm.jsp
	}

	// 로그인 하기 누른후, (loginForm: post 이동 후,) 개인정보 작성후, 로그인 화면 누를시,
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		LoginDTO mdto = (LoginDTO) session.getAttribute("member");
		System.out.println("/login post session dto======" + dto);
		String nextPage = "";
		if (mdto != null) {// 회원인 경우
			System.out.println("memberDTO.id  :  " + mdto.getUserid());
			if (mdto.getUserid().equals(dto.getUserid()) && mdto.getPasswd().equals(dto.getPasswd())) {// 인증성공
				session.setAttribute("login", dto); // login키로 폼에서 넘어온 데이터 저장
				nextPage = "logined"; // logined.jsp
			} else {// 인증실패
				System.out.println("id또는 비밀번호가 틀림");
				nextPage = "redirect:login"; // /login get다시 요청
			}

		} else {
			System.out.println("회원가입정보가 없습니다 .");
			nextPage = "redirect:login";// /login get
		}

		return nextPage;
	}

	// 로그아웃시
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main"; // /main get방식 다시 요청
	}
}
