import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx= new 
				GenericXmlApplicationContext("classpath:Person.xml");
		Person p1= ctx.getBean("kkk",Person.class);
	
	
		System.out.println(p1); //Person(toString)
		System.out.println(p1.toString()); //Person 객체
		System.out.println(p1.getAge()); //Person 나이
		System.out.println(p1.getName()); //Person 이름
		System.out.println(p1.getClass()); //Person class
	}

}
