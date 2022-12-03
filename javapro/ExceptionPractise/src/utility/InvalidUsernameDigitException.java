package utility;

public class InvalidUsernameDigitException extends RuntimeException{
	private String mess;
	
	public InvalidUsernameDigitException() {
		mess = "password must contain at least 2 digits! Samjhe!! ";
	}
	
	public String getMessage() { //Not necessary.
		return mess;
	}
}
