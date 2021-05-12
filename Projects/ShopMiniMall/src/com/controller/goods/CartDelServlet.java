package com.controller.goods;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.GoodsService;

@WebServlet("/CartDelServlet")
public class CartDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartDelServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String nextPage = "null";
		if (dto != null) {
			int num = Integer.parseInt(request.getParameter("num"));
			CartService service = new CartService();
			int result = service.cartDel(num);
			System.out.println("삭제 갯수: " + result);
			//삭제완료
			nextPage = "CartListServlet";
		} else {
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");

		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
