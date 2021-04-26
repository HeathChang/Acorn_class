
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");
		Person p = ctx.getBean("xxx", Person.class);
		try {
			p.getInfo();
		} catch (Exception e) {
			System.out.println("catch getMessage(): " + e.getMessage());
		}
		System.out.println("end");
	}

}
