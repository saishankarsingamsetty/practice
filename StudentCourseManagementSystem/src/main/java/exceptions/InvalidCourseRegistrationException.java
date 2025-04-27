package exceptions;

public class InvalidCourseRegistrationException extends Exception{

	public InvalidCourseRegistrationException(){
		super();
	}
	 

	public InvalidCourseRegistrationException(String msg){
		super(msg);
	}
}
