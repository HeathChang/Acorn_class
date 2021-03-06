import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dept.xml");
		ProductService service = ctx.getBean("deptService", ProductService.class);
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}

		System.out.println("p01상품 5개 주문합니다. ");
		try {
			service.addOrder("p01", 5);// add시, 문제 발생
			// T_order에 insert, T_product update -> 에러 발생 롤백
			// T_order에 인서트 되었는지 확인할 것

		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리");
		}

		list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
	}

}
