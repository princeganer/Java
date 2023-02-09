package utility;
public class User {

	private static String user;
	private static String pass;
	
	public User(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public static void registerUser() {
		boolean flag = true;
		
		// For checking length
		if(user.length() != 5) {
			flag = false;
			throw new InvalidUsernameException();
		}
		else {
			System.out.println("Hurray, Username available.");
		}
		
		// For checking no of digits in password
		int count = 0;
		for(int i= 0; i< pass.length(); i++) {
			if(pass.charAt(i)>='0' && pass.charAt(i)<= '9') {
				count = count+1;
			}
		}
		if (count< 2) {		
			throw new InvalidUsernameDigitException();
		}
		else {
			System.out.println("Good password, mate!");
		}
	}

}
