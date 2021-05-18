
package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.DeptDTO;

@Repository
public class DeptDAO {

	@Autowired
	SqlSessionTemplate template;/////////

	public int insert(DeptDTO dto) {
		int n = template.insert("javaconfig.insert", dto);
		return n;
	}
	// Transaction  처리,,,, delet문을 사용시 에러 발생 
	public int delete(int deptno2) {
		int n = template.delete("javaconfig.delete", deptno2);
		return n;
	}
	
	
	
	
	
	
	public int update(DeptDTO dto) {
		int n = template.update("javaconfig.update", dto);
		return n;
	}



	public List<DeptDTO> select() {
		return template.selectList("javaconfig.selectAll");
	}

	public DeptDTO selectById(int deptno) {
		return (DeptDTO) template.selectOne("javaconfig.selectById", deptno);
	}
}
