package com.controller.goods;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;


@WebServlet("/CartDelAllServlet")
public class CartDelAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CartDelAllServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MemberDTO dto =(MemberDTO)session.getAttribute("login");
		String nextPage=null;
		if(dto!=null) {
			String[] data= request.getParameterValues("data");
			List<String> list=Arrays.asList(data);
			System.out.println("list 값: "+list);
			CartService service= new CartService();
			int result=service.cartAllDel(list);
			System.out.println(result+"개의 데이터가 삭제되었습니다.");
			nextPage="CartListServlet";
		}else {
			nextPage="LoginUIServlet";
			session.setAttribute("mesg","로그인이 필요한 작업입니다. ");
			
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
