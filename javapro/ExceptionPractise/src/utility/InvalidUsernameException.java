package utility;

public class InvalidUsernameException extends RuntimeException{ // This is an unchecked Exception
															    // 
	private String mess;
	
	public InvalidUsernameException() {
		mess = "Usename is invalid, 5 characters hi dalo mama";
	}
	
	public String getMess() {
		return mess;
	}
	
}
