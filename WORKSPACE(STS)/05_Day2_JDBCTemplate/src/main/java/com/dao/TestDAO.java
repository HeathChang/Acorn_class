package com.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

/*
 
  create table test
( num number(4) primary key,
  username varchar2(10),
  address varchar2(10) );
  
  insert into test values ( 1, '홍길동' , '서울');
insert into test values ( 2, '이순신' , '전라');
insert into test values ( 3, '유관순' , '서울');
insert into test values ( 4, '강감찬' , '서울');
insert into test values ( 5, '유재석' , '서울');
   commit;
 */
public class TestDAO {
	// ojdbc6_g.jar 압축파일안의 핵심 클래스 사용함

	/*
	 * @Autowired DataSource dataSource;
	 */
	//DataSource를 직접사용하지 않고   JdbcTemplate생성시 DataSource사용
	private JdbcTemplate jdbcTemplate;
		
		public TestDAO(DataSource dataSource){
			this.jdbcTemplate= new JdbcTemplate(dataSource); //xml에서 DataSource에서 주입함
		}
		
		public List<TestDTO> select(){
			List<TestDTO> list =jdbcTemplate.query("select * from test", 
					new RowMapper<TestDTO>() {
						public TestDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
							TestDTO dto= new TestDTO();
							dto.setNum(rs.getInt(1));
							dto.setUsername(rs.getString(2));
							dto.setAddress(rs.getString(3));
							return dto;					
						}	
			});// end
			return list;
		}//end select
		
		public List<TestDTO> selectByName(String name){
			List<TestDTO> list =jdbcTemplate.query("select * from test where username=?", 
					new RowMapper<TestDTO>() {
						public TestDTO mapRow(ResultSet rs, int roNum) throws SQLException {
							TestDTO dto= new TestDTO();
							dto.setNum(rs.getInt(1));
							dto.setUsername(rs.getString(2));
							dto.setAddress(rs.getString(3));
							return dto;					
						}	
			}, name );// end .query 함수 	
			
			return list;
		}//end selectByName
		
		public int insert(int num, String name, String address){
			return jdbcTemplate.update("insert into test (num, username, address) values (?,?,?)",
			num, name, address);
					
		}//end insert
	}






