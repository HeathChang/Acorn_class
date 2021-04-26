import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("Test.xml");
		TestDAO dao = ctx.getBean("dao", TestDAO.class);
		ArrayList<TestDTO> list = dao.select();
		int num=dao.insert(27, "하울", "성");
		System.out.println(num);
		for (TestDTO s : list) {
			System.out.println(s);
		}

		/*
		 * TestDAO dao = new TestDAO(); ArrayList<TestDTO> list =dao.select(); for
		 * (TestDTO s : list) { System.out.println(s); }
		 */
	}

}
