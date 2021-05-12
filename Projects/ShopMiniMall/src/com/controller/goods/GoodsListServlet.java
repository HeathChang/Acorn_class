package com.controller.goods;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.GoodsService;

import sun.rmi.server.Dispatcher;

import com.dto.GoodsDTO;

@WebServlet("/GoodsListServlet")
public class GoodsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GoodsListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 시작점 GoodsListServlet -> 상품정보를 담음 (최초는 top인 애들)
		// -> main.jsp -include하고있는 goods/goodsList.jsp(top 상품 정보 출력)
		
		// 1.catergory 파싱, 없는 경우 top 설정
		// 2.얻어온 list를 request에 설정 goodsList
		// 3.main으로 forward
		// 4. list를 main.jsp로 넘김
		String gCategory=request.getParameter("gCategory"); //파싱
		System.out.println("gCategory값: "+gCategory);
		//최초 요청시에는 gCategory값이 =null
		
		if(gCategory==null) {
			gCategory="top";
		}
		System.out.println("gCategory: "+gCategory);
		GoodsService service= new GoodsService();
		List<GoodsDTO> list=service.goodsList(gCategory);
		
		System.out.println("list: "+list);
		System.out.println("list.size(): "+list.size());
		request.setAttribute("goodsList", list);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
