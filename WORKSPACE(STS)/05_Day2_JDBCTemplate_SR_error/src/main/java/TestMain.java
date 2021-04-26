import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("config.xml");
		TestDAO dao = ctx.getBean("dao", TestDAO.class);
		int num=dao.selectCount();
		System.out.println("성공여부: "+num);
		
		ArrayList<TestDTO> list =(ArrayList<TestDTO>) dao.select();
		for (TestDTO s : list) {
			System.out.println(s);
		}
		
		
	}

}
