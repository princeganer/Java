package utility;

public class InvalidCountryException extends Exception{
	String savage;
	
	public InvalidCountryException() {
		savage= "User from country other than India can't register";
	}
	
	public String getMessage() {
		return savage;
	}

}