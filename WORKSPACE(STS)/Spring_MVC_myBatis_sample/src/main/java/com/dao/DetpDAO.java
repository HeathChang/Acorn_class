package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository/////////////////////////// component스캔으로 자동등록 
public class DetpDAO {
	@Autowired
	SqlSessionTemplate session; //root-context.xml에서 빈생성 

	public List<DeptDTO> list(){
		return session.selectList("DeptMapper.list");
	}

	

}
