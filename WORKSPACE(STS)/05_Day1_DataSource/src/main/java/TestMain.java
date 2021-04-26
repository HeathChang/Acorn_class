import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("config.xml");
		TestDAO dao = ctx.getBean("dao", TestDAO.class);
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO s : list) {
			System.out.println(s);
		}
		int resultInsert = dao.insert(20, "덕배", "서울");
		System.out.println("추가 결과: " + resultInsert);

		int resultUpdate = dao.update(20, "충배", "부산");
		System.out.println("업데이트 결과: " + resultUpdate);

		int resultDelete = dao.delete(20);
		System.out.println("삭제결과: " + resultDelete);

		/*
		 * TestDAO dao = new TestDAO(); ArrayList<TestDTO> list =dao.select(); for
		 * (TestDTO s : list) { System.out.println(s); }
		 */
	}

}
