package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO xx) {
		int result= session.insert("CartMapper.cartAdd",xx);
		return result;
	}

	public List<CartDTO> cartList(SqlSession session, String userid) {
		List<CartDTO> list =session.selectList("CartMapper.cartList",userid);
		return list;
	}

	public int orderDone(SqlSession session, OrderDTO dto2) {
		System.out.println("dto2.toString in DAO: "+dto2.toString());
		int result1= session.insert("CartMapper.orderDone",dto2);
		return result1;
	}	
	
	public int cartDel(SqlSession session, int num) {
		System.out.println("orderNum in DAO: "+num);
		int result=session.delete("CartMapper.cartDel", num);
		return result;
	}

	public int cartUpdate(SqlSession session, HashMap<String, Integer> map) {
		int result=session.update("CartMapper.cartUpdate", map);
		return result;
	}

	public int cartAllDel(SqlSession session, List<String> list) {
		int result=session.delete("CartMapper.cartAllDel", list);
		return result;
	}

	public CartDTO cartbyNum(SqlSession session, String num) {
		CartDTO result=session.selectOne("CartMapper.cartbyNum", num);
		return result;
	}

	

}
