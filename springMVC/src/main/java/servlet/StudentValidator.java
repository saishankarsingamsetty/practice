package servlet;

import org.springframework.validation.Errors;

public class StudentValidator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Student.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student student = (Student)target;
		
		if(student.getName().isEmpty()) {
			errors.rejectValue("name", "", "name must not be empty");
		}
		
		if(student.getEmail().isEmpty()) {
			errors.rejectValue("email", "", "email must not be empty");
		}
		
		if( student.getAge() != null && student.getAge()<=0) {
			errors.rejectValue("age", "", "age must be positive");
		}
		
		if(student.getAge() == null) {
			errors.rejectValue("age", "", "age must not be empty");
		}
		
	}

	
}
