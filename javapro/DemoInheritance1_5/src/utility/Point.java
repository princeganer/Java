package utility;

public class Point {
	private int x, y;	

	public Point() {	// NoArgs cstr
		x = 404;
		y = 404;
	}

	public Point(int x, int y) {	// Args cstr
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		String str;
		str= "Point X: "+x+" Point Y: "+y;
		return str;
	}

}
