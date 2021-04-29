package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {

	public List<DeptDTO> select(SqlSessionTemplate session){
		return session.selectList("selectAll");//Mapper id="selectAll"
	}
	
	
	/*
	 * public int insert(DeptDTO dto) { return session.insert("insert",dto); }
	 * public int update(DeptDTO dto) { return session.update("update",dto); }
	 * public int delete(int deptno) { return session.delete("delete",deptno); }
	 */


}
