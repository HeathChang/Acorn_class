import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {
	 public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/config/student.xml");
		Student s1=ctx.getBean("stu1" , Student.class);
		Student s2=ctx.getBean("stu1" , Student.class);
		
		Student s3=ctx.getBean("stu2" , Student.class);
		Student s4=ctx.getBean("stu2" , Student.class);
		
		
		System.out.println("singletone: "+ (s1==s2)); //singletone: 기본값
		System.out.println("prototype: " + (s3==s4)); //prototype: 기본값
	}
}
