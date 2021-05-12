package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

import sun.rmi.server.Dispatcher;


@WebServlet("/MemberIdSearchServlet")
public class MemberIdSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MemberIdSearchServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	String nextPage=null;
	
	String username= request.getParameter("username").trim();
	String phone1=request.getParameter("phone1").trim();
	String phone2=request.getParameter("phone2").trim();
	String phone3=request.getParameter("phone3").trim();
	String email1=request.getParameter("email1").trim();
	String email2=request.getParameter("email2").trim();
	
	MemberDTO dto=new MemberDTO();
	dto.setUsername(username);
	dto.setPhone1(phone1);
	dto.setPhone2(phone2);
	dto.setPhone3(phone3); //원래 email도 해야되나 생략.
	MemberService service= new MemberService();
	String userid=service.idSearch(dto);
	
	if(userid==null) {
		nextPage="MemberIdSearchUIServlet";
		request.setAttribute("mesg", "이름또는 핸드폰이 등록되지 않았습니다.");
		
	}else {
		nextPage="SendMailServlet";
		request.setAttribute("mailTo", email1+"@"+email2);//받는사람의 메일주소
		request.setAttribute("userid", userid); //
	}
	RequestDispatcher dis = request.getRequestDispatcher(nextPage);
	dis.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
