package utility;
import java.util.Scanner;

public class Rectangle {
	private double len, bre, area;
	
	public void drawShape() {
		System.out.println("calculating area for Reactangle");
	}
	
	public void calculateArea() {
		Scanner sc1= new Scanner(System.in);
		len= sc1.nextDouble();
		
		Scanner sc2= new Scanner(System.in);
		bre= sc2.nextDouble();
		
		area= len*bre;
		
		System.out.println("Area:"+ area);
		
	}
}
