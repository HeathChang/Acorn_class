package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GoodsDTO;

public class GoodsDAO {
	public List<GoodsDTO> goodsList(SqlSession session, String category) {
		List<GoodsDTO> list = session.selectList("GoodsMapper.goodsList",category);
		return list;
	}

	public GoodsDTO goodsRetrieve(SqlSession session, String gCode) {
		GoodsDTO dto = session.selectOne("GoodsMapper.goodsRetrieve",gCode);
		return dto;
	}

	
}
