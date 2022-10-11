package utility;
import java.util.Scanner;

public class Triangle implements Drawable{
	private double base, height, area;
	
	public void drawShape() {
		System.out.println("Area of Triangle");
	}
	
	public void calculateArea() {
		System.out.println("Enter base");
		Scanner scan= new Scanner(System.in);
		base =scan.nextDouble();
		
		System.out.println("Enter height");
		Scanner scan1= new Scanner(System.in);
		height =scan1.nextDouble();
		
		area=0.5*base*height;
		System.out.println("Area of Triangle is :"+area);
		//scan.close();
		//scan1.close();
	}

	
}
