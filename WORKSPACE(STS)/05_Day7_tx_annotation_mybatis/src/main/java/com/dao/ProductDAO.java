package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductDAO {
	SqlSessionTemplate template; // 주입

	public SqlSessionTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	public List<ProductDTO> selectProduct() {
		return template.selectList("productList");
	}

	public List<ProductDTO> selectOrder() {
		return template.selectList("orderList");
	}

	public void addOrder(String pcode, int quantity) {

		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		dto.setQnantity(quantity);
		
		template.insert("order.orderInsert",dto);
		template.update("product.produc          ",dto); //고의로 에러 발생
	}//end insert
	
	
}