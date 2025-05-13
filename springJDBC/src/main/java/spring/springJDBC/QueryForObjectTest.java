package spring.springJDBC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QueryForObjectTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		StudentDao dao = context.getBean(StudentDao.class);
//		System.out.println(dao.studentRecordsCount());
//		
//		System.out.println(dao.studentNameById(101));
//		
//		System.out.println(dao.studentDetailsById(101));
//		
//		System.out.println(dao.studentDetailsByAge(24));
//		
//		System.out.println(dao.deleteStudentsOnAgeIsNull());
//		
//		System.out.println(dao.getStudentById(103));
//		
//		System.out.println(dao.getStudentsByAge(24));
		
//		System.out.println(dao.getStudentNameByIdUsingNPJT(101));
		
//		System.out.println(dao.getStudentNameByIdUsingMSPS(105));
		
//		System.out.println(dao.insertStudentUsingBeanProperySqlParameterSource(new Student(105,"king",25)));
		
		System.out.println(dao.insertStudentUsingSimpleJdbcInsert(new Student(107,"rapo",26)));
	}
	
}
