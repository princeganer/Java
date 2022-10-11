package utility;

public class PasswordTooLongException extends Exception{
	String msg; 
	
	public PasswordTooLongException() {
		msg= " The password is tooo long!";	
	}
	
	public String getMessage() {
		return msg;
	}

}
