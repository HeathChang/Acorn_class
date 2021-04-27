import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.ProductDTO;
import com.service.ProductService;

public class DeptMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/config/product.xml");
		ProductService service = ctx.getBean("deptService", ProductService.class);

		List<ProductDTO> list = service.selectProduct();
		System.out.println(list);

		// 상품
		System.out.println("p01상품 5개 주문합니다. ");
		try {
			service.addOrder("p01", 5);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리");
		}

		list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
	}
}