import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		//기존 사용 방법
		/*
		 * Person p = new Person(); String m =p.getInfo(); System.out.println(m);
		 */
		//////방법1.
		//1.xml 설정 파일 읽기
		GenericXmlApplicationContext ctx= new
				GenericXmlApplicationContext("classpath:person.xml");
		//2.xxx로 등록된 빈 객체 받기
		Person p1=ctx.getBean("xxx",Person.class);
		//3. bin 객체 사용하기
		System.out.println(p1);
		System.out.println(p1.getInfo());
		
		////////방법2.
		Person p2=(Person)ctx.getBean("xxx"); //id로 빈 객체 얻어오고 형변환후 사용 
		System.out.println(p2.getInfo());
		
	}

}
