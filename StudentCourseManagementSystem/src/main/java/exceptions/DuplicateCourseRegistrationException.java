package exceptions;


public class DuplicateCourseRegistrationException extends Exception{

	public DuplicateCourseRegistrationException() {
		super();
	}
	
	public DuplicateCourseRegistrationException(String msg) {
		super(msg);
	}
}
