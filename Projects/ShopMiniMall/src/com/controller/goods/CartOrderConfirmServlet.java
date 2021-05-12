package com.controller.goods;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;


@WebServlet("/CartOrderConfirmServlet")
public class CartOrderConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CartOrderConfirmServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MemberDTO dto= (MemberDTO) session.getAttribute("login");
		String nextPage=null;
		if(dto!=null) {
			String num=request.getParameter("num");
			System.out.println("num: "+num);
			CartService service= new CartService();
			CartDTO goods=service.cartbyNum(num);
			
			
			nextPage="orderConfirm.jsp";
			request.setAttribute("goods", goods);
		}else{
			nextPage="LoginUIservlet";
			request.setAttribute("mesg", "다시 로그인을 해주십시오. ");
			}
		
		RequestDispatcher dis= request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
		}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
