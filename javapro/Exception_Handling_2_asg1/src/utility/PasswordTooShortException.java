package utility;

public class PasswordTooShortException extends Exception{
	String msg;
	
	public PasswordTooShortException() {
		msg= "Password is tooo short";
	}
	
	public String getMessage() {
		return msg;
	}
	
}
