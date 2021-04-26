
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		Student stu = ctx.getBean("firstStudent", Student.class);

		Set<Cat> cats = stu.getCats();
		System.out.println(cats); //중복 불가이기떄문에, 2마리만 나온다. 
		System.out.println(stu.toString());
	}
}
