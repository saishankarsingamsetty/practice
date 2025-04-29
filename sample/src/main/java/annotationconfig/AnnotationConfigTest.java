package annotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}
	
}
