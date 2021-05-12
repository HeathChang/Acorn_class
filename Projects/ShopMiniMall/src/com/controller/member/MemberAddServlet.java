package com.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		String passwd=request.getParameter("passwd");
		String username= request.getParameter("username");
		String post=request.getParameter("post");
		String addr1=request.getParameter("addr1");
		String addr2=request.getParameter("addr2");
		String phone1=request.getParameter("phone1");
		String phone2=request.getParameter("phone2");
		String phone3=request.getParameter("phone3");
		String email1=request.getParameter("email1");
		String email2=request.getParameter("email2");
		//써진 데이터를 Data Transfer Object를 통해 1차저장하기 위해  변수 저장
		
		MemberDTO dto = new MemberDTO(userid,passwd,username,post,addr1,addr2,phone1,phone2,phone3,email1,email2);
		//저장된 데이터를 DTO에다 1차 저장
		MemberService service= new MemberService();
		int n=service.memberAdd(dto);
		//dto를 통해 service로 데이터 보내기 
		System.out.println(n);
		
		if(n==1) {
		HttpSession session=request.getSession();
		session.setAttribute("mesg", "회원가입성공");
		response.sendRedirect("main");
		} else {
			
		}
	//데이터 파싱 후 memberDTO생성
		//1.sysout
	//SERVICE에  dto  전송  db 에 insert(SERVICE->DAO이용->MAPPER 이용)
		//2.num.디펠로퍼 확인
	//이후  SESSION에 로그인 정보 저장(다음 줄 코드임) 
		//
		
	//메인화면으로 이동//추후 설명 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
