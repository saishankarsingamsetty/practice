package exceptions;

public class InvalidStudentRegistrationException extends Exception {

	public InvalidStudentRegistrationException() {
		super();
	}

	public InvalidStudentRegistrationException(String msg) {
		super(msg);
	}

}
