package demo_app;

import utility.*;

public class UserRegistration {

	public static void registerUser(String username, String usercountry) {
		try {
			if(!usercountry.equals("India")){
				throw new InvalidCountryException();
			}

			if(usercountry.equals("India")) {
				System.out.println("User registration done successfully.");
			}
		}
		catch(InvalidCountryException e){
			System.out.println(e.getMessage());
		}
	}


	public static void main(String[] args) {

		registerUser("Patil", "India");
		

	}

}
