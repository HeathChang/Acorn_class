

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");
		Student stu = ctx.getBean("stu", Student.class);
		stu.getInfo();
		ctx.close(); //destory 함수 호출 
		
	}

}
