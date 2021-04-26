import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext(
						"classpath:com/spring/person.xml"
						);
		Person p1= ctx.getBean("xxx",Person.class);
		System.out.println(p1);
		Cat c1=p1.getCat();
		System.out.println(c1);
	}

}
