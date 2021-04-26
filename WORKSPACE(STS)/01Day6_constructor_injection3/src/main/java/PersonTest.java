import org.springframework.context.support.GenericXmlApplicationContext;


import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext(
						"classpath:com/spring/person.xml"
						);
		Person p1= ctx.getBean("xxx",Person.class);
		System.out.println("getInfo: "+p1.getInfo());
		System.out.println("toString: "+p1.toString());
	}

}
