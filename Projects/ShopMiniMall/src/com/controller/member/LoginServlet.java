package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		String passwd=request.getParameter("passwd");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userid",userid);
		map.put("passwd",passwd);
		
		MemberService service= new MemberService();
		MemberDTO dto= service.login(map); //service에서 가져온 값을 dto에 저장한다. 
		System.out.println("로그인 정보 : "+dto);
		
		String nextPage="loginForm.jsp"; //기본 아닌경우. 
		if(dto!=null) { //회원경우
			nextPage="main"; //main 혹은 GoodsServlet으로 후에 변경
			HttpSession session= request.getSession();
			session.setAttribute("login", dto); //이 시점에서 로그인 정보 저장 (회원 한명 )
			
		}
		
		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
