package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;


public class GoodsService {

	public List<GoodsDTO> goodsList(String category) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<GoodsDTO> list;
		try {
			GoodsDAO dao = new GoodsDAO();
			list= dao.goodsList(session, category);
			session.commit();
		} finally {
			session.close();
		}
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		SqlSession session = MySqlSessionFactory.getSession();
		GoodsDTO dto;
		try {
			GoodsDAO dao = new GoodsDAO();
			dto= dao.goodsRetrieve(session, gCode);
			session.commit();
		} finally {
			session.close();
		}
		return dto;
	}


	
	

}
