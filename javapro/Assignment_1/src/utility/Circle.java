package utility;
import java.util.Scanner;

public class Circle implements Drawable{
	private double r, area;
	
	public void drawShape() {
		System.out.println("Calculating area for Circle");
	}
	
	public void calculateArea() {
		System.out.println("Enter radius");
		@SuppressWarnings("resource")
		Scanner s1= new Scanner(System.in);
		r= s1.nextDouble();
		
		area= pi*r*r;
		System.out.println("Area: "+area);
		//s1.close();
	}
	
}
