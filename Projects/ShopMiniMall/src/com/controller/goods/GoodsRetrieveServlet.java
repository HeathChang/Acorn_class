package com.controller.goods;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GoodsDTO;
import com.service.GoodsService;


@WebServlet("/GoodsRetrieveServlet")
public class GoodsRetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public GoodsRetrieveServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gCode=request.getParameter("gCode");
		
		GoodsService service= new GoodsService();
		GoodsDTO dto=service.goodsRetrieve(gCode);
		
		request.setAttribute("goodsRetrieve", dto);
		
		RequestDispatcher dis = request.getRequestDispatcher("goodsRetrieve.jsp");
		//3개 jsp, include,goods/goodsRetrieve.jsp
		dis.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
