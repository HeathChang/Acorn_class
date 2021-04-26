

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("file:\\C:\\upload\\person.xml");
		// [\\] 을 사용해야한다	
		Person p1 =ctx.getBean("xxx",Person.class);
		System.out.println("p1: "+p1.getInfo());
		
		Person p2 =(Person)ctx.getBean("xxx");
		System.out.println("p2: "+p2.getInfo());
	}
	

}
