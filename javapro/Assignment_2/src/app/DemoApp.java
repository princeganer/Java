package app;
import utility.*;

public class DemoApp {

	public static void main(String[] args) {
		
		MyNumber n1= new MyNumber(10);
		System.out.println("Is Odd? "+n1.isOdd());  // for return type bool
		                                            // go for sysout
		System.out.println("Is Even? "+n1.isEven());
		System.out.println("Is Prime? "+n1.isPrime());
		System.out.println("Factorial Is "+n1.calFactorial());

	}

}
