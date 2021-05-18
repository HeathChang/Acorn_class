package com.example.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.DeptDTO;

@Repository
public class DeptDAO {

	
	
	@Autowired
	SqlSessionTemplate template;
	
	public int insert(DeptDTO deptDTO) {
		return template.insert("javaconfig.insert",deptDTO);
		
	}
	public int delete(int i) {
		return template.delete("javaconfig.delete",i);
		
	}
	


}
