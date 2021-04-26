import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {
	 public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/config/stu.xml");

		Student s1=ctx.getBean("stu" , Student.class);
		Student s2=ctx.getBean("stu" , Student.class);
		System.out.println("s1의 값: "+s1.toString());		
		System.out.println("s2의 값: "+s2.toString());		
		System.out.println("prototype 결과값: " + (s1==s2)); 
	}
}
