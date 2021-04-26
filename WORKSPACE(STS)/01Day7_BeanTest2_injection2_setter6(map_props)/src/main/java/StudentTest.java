

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("stu.xml");
		Student stu=ctx.getBean("firstStudent",Student.class);
		
		Map<String,Cat> mapCat=stu.getMapCat();
		Set<String> keys=mapCat.keySet();
		for (String key : keys) {
			System.out.println(mapCat.get(key));
		}
		
		System.out.println("========");
		
		Properties props=stu.getPhones();
		Set<String>xxx=props.stringPropertyNames(); //key값만 set으로 리턴
		for (String key : xxx) {
			System.out.println(key);
			System.out.println(props.get(key));
		}
	}

}
