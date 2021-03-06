package com.controller.goods;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.CartService;


@WebServlet("/CartOrderDoneServlet")
public class CartOrderDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CartOrderDoneServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		MemberDTO dto=(MemberDTO)session.getAttribute("login");
		String nextPage="";
		if(dto!=null) {
			//int num=Integer.parseInt(request.getParameter("num"));
			String userid=dto.getUserid();
			String gCode=request.getParameter("gCode");
			String gName=request.getParameter("gName");
			int gPrice=Integer.parseInt(request.getParameter("gPrice"));
			String gSize=request.getParameter("gSize");
			String gColor= request.getParameter("gColor");
			int gAmount=Integer.parseInt(request.getParameter("gAmount"));
			String gImage=request.getParameter("gImage");
			String orderName=request.getParameter("orderName");
			String post=request.getParameter("post");
			String addr1=request.getParameter("addr1");
			String addr2=request.getParameter("addr2");
			String phone=request.getParameter("phone");
			String payMethod=request.getParameter("payMethod");
			int orderNum=Integer.parseInt(request.getParameter("orderNum"));
			
			OrderDTO dto2= new OrderDTO(0,userid,gCode,gName,gPrice,gSize,gColor, gAmount,gImage,
									  orderName,post,addr1,addr2,phone,payMethod,null);
			CartService service= new CartService();
			
			int result=service.orderDone(dto2,orderNum);
			System.out.println(result);
			request.setAttribute("orderDTO", dto2);
			nextPage="orderDone.jsp";
		}else {
			nextPage="LoginUIServlet";
			session.setAttribute("mesg", "???????????? ????????? ???????????????. ");;
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
