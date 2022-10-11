package demo_app;

import java.util.Scanner;
import utility.*;

public class App {

	public static void main(String[] args) {

		String pwd;

		try {
			System.out.println("Enter the password");
			Scanner bc1= new Scanner(System.in);
			pwd = bc1.next();

			if(pwd.length()>12) {
				throw new PasswordTooLongException();
			}

			if(pwd.length()<8) {
				throw new PasswordTooShortException();
			}
		}

		catch(PasswordTooLongException el){
			System.out.println(el.getMessage());
		}
		
		catch(PasswordTooShortException es){
			System.out.println(es.getMessage());
		}

	}

}
