package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {

	/*
	 * @Autowired DataSource dataSource; DataSource를 직접 사용하지않고, JDBC Template 생성시
	 * Datasource 사용
	 */
	JdbcTemplate jdbcTemplate;

	public TestDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate; // config에서 주입
	}

	public int selectCount() {
		Integer count = jdbcTemplate.queryForObject("select count(*) from test", Integer.class);
		return count;
	}
	
	public List<TestDTO> select() {
		List<TestDTO> list = jdbcTemplate.query("select * from test", new RowMapper<TestDTO>() {
			public TestDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				TestDTO dto = new TestDTO();
				dto.setNum(rs.getInt(1));
				dto.setUsername(rs.getString(2));
				dto.setAddress(rs.getString(3));
				return dto;
			}
		});
		return list;
	}
	
}
