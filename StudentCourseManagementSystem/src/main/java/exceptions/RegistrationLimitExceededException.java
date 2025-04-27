package exceptions;

public class RegistrationLimitExceededException extends Exception{

	public RegistrationLimitExceededException() {
		super();
	}
	
	public RegistrationLimitExceededException(String msg) {
		super(msg);
	}
}
