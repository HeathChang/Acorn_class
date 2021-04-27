package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.ProductDTO;

public class ProductService {
	ProductDAO dao; //set통해서 주입 
	
	@Transactional // tx 처리함 . 필요함수 위에 붙여줌: 자동 commit & rollback 실행 
	/*
	 * public void addOrder(String pcode,int quantity) throws Exception{
	 * //addOrder:주문 발생: 제품코드, 수량 dao.addOrder(pcode,quantity); //제품에 관련 주문 테이블
	 * insert, 제품에 관련된 제품 테이블에서 수량 update }
	 */

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	// 전체 상품 목록
		public List<ProductDTO> selectProduct() {
			List<ProductDTO> list = dao.selectProduct();
			return list;
		}// end select
		
		public List<ProductDTO> selectOrder() {
			return dao.selectOrder();
		
		}// end select

		@Transactional
		public void addOrder(String pcode, int quantity)throws Exception {
			dao.addOrder(pcode,quantity);
			
		}

	
}
