package com.controller.goods;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;


@WebServlet("/CartUpdateServlet")
public class CartUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CartUpdateServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MemberDTO dto =(MemberDTO)session.getAttribute("login");
		String nextPage=null;
		if(dto!=null) {
			String num = request.getParameter("num");
			String gAmount = request.getParameter("gAmount");
			System.out.println("cartupdateServlet>>>>>" + num + "" + gAmount);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("num",Integer.parseInt(num));
			map.put("gAmount",Integer.parseInt(gAmount));
			
			CartService service= new CartService();
			int result=service.cartUpdate(map);
			System.out.println("Update된 걧수: "+result);
			
		}else {
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
			response.sendRedirect(nextPage);
		}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
