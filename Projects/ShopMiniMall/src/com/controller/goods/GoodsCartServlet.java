package com.controller.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;

//장바구니에 담는 역할
@WebServlet("/GoodsCartServlet")
public class GoodsCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO dto= (MemberDTO)session.getAttribute("login");
		String nextPage=null;
	
		if (dto!=null) {
			String gImage = request.getParameter("gImage");
			String gCode = request.getParameter("gCode");
			String gName = request.getParameter("gName");
			String gPrice = request.getParameter("gPrice");
			String gSize = request.getParameter("gSize");
			String gColor = request.getParameter("gColor");
			String gAmount=request.getParameter("gAmount");
			String userid=dto.getUserid(); //세션에 저장된 아이디 사용 
		
			CartDTO xx = new CartDTO();
			xx.setgImage(gImage);
			xx.setgCode(gCode);
			xx.setgName(gName);
			xx.setgPrice(Integer.parseInt(gPrice));
			xx.setgSize(gSize);
			xx.setgColor(gColor);
			xx.setgAmount(Integer.parseInt(gAmount));
			xx.setUserid(userid);
			
			CartService service = new CartService();
			int result = service.cartAdd(xx);
			System.out.println(result);
			nextPage="GoodsListServlet?"; //주의url?key=value로 데이터 전송 
			session.setAttribute("mesg", gCode+"가 Cart에 저장되었습니다.");
		} else {
			nextPage="LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다. ");
		}
			response.sendRedirect(nextPage);//라다이렉트시 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
