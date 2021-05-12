package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

public class CartService {

	public int cartAdd(CartDTO xx) {
			SqlSession session = MySqlSessionFactory.getSession();
			int result=0;
			try {
				CartDAO dao = new CartDAO();
				result= dao.cartAdd(session,xx);
				session.commit();
			} finally {
				session.close();
			}
			return result;
		}

	public List<CartDTO> cartList(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<CartDTO> list=null;
		try {
			CartDAO dao = new CartDAO();
			list= dao.cartList(session,userid);
			session.commit();
		} finally {
			session.close();
		}
		return list;
	}


	public int cartUpdate(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			CartDAO dao = new CartDAO();
			result= dao.cartUpdate(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	public int cartAllDel(List<String> list) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			CartDAO dao = new CartDAO();
			result= dao.cartAllDel(session,list);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	public CartDTO cartbyNum(String num) {
		SqlSession session = MySqlSessionFactory.getSession();
		CartDTO result;
		try {
			CartDAO dao = new CartDAO();
			result= dao.cartbyNum(session,num);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}

	public int orderDone(OrderDTO dto2, int orderNum) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result=0;

		try {
			CartDAO dao = new CartDAO();
			System.out.println("dto2.toString: "+dto2.toString());
			System.out.println("orderNum: "+orderNum);
			result = dao.orderDone(session, dto2);
			result=	dao.cartDel(session, orderNum);
			session.commit();
		}catch (Exception e) {
			session.rollback();
			System.out.println("롤백되었습니다"+e);
		
		} finally {
			session.close();
		}
	
		return result;

	}
	
	public int cartDel(int num) {
		SqlSession session = MySqlSessionFactory.getSession();
		int result;
		try {
			CartDAO dao = new CartDAO();
			result= dao.cartDel(session, num);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}


	}
