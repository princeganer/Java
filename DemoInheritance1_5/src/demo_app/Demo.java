package demo_app;

import utility.*;    // not importing gives error

public class Demo {
	
	public static void main(String[] args) {
		
		Point cp1= new ColorPoint();    // reference class: Point
		System.out.println(cp1);        // object Class
		
		Point cp2= new ColorPoint(10, 14, "black");
		System.out.println(cp2);
		
		Point cp3= new ColorPoint(10, 14, "Black");
		System.out.println(cp3);
		
	}

}
