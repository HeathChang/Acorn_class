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


@WebServlet("/CartDelAllServlet2")
public class CartDelAllServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CartDelAllServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = null;
		if (dto != null) {
			String[] data = request.getParameterValues("check");
			System.out.println("data:" + data);
			List<String> list = Arrays.asList(data);
			System.out.println("list: " + list);
			CartService service = new CartService();
			int result = service.cartAllDel(list);
			System.out.println(result + "개의 데이터가 삭제되었습니다.");
			nextPage = "CartListServlet";
			//System.out.println("list:"+list.size()); 삭제시, list는 0 
		} else {
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다. ");
			
		}
		response.sendRedirect(nextPage);
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
