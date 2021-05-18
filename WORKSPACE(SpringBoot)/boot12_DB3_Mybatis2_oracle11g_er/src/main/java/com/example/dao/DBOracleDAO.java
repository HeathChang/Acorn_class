package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.Dept;
@Repository
public class DBOracleDAO implements DBDao {
	
	
	
	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("DeptMapper.selectAll");
	}

	@Override
	public int insert(SqlSessionTemplate session, Dept dept) {
		// TODO Auto-generated method stub
		return session.insert("DeptMapper.selectAll",dept);
	}

	@Override
	public int update(SqlSessionTemplate session, Dept dept) {
		// TODO Auto-generated method stub
		return session.update("DeptMapper.update",dept);
	}

	@Override
	public int deleteByDeptno(SqlSessionTemplate session,int i) {
		// TODO Auto-generated method stub
		return session.delete("DeptMapper.deleteByDeptno",i);
	}

}
