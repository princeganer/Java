/*
 * Assignment 4:  
 */
class Point{
	private int x, y;
	
	public Point(){    // no arg constructor, also called default by faculty
		x=y=404;
	}
	
	public Point(int x, int y){    // arg constructor
		this.x= x;
		this.y= y;
	}
	
	public Point(Point sub) {    // passing object as arg
		this.x= sub.x;
		this.y= sub.y;
	}
	
	public void showPoint(){
		System.out.println("[ "+x+", "+y+" ]");
	}
	
}


public class PinPoint {

	public static void main(String[] args) {
		
		Point p1= new Point();
		p1.showPoint();
		
		Point p2= new Point(10, 20);
		p2.showPoint();
		
		Point p3= new Point(p1);
		p3.showPoint();

	}

}
