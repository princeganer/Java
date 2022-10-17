package utility;

public class ColorPoint extends Point {    //Inheritance 
	                                       // child: ColorPoint, parent: Point
	private String color;
	private static String colors[];        // static array, CHECK for public
	
	static {							   // static block
		colors = new String[5];
		colors[0]= "Black";
		colors[1]= "Red";
		colors[2]= "Yellow";
		colors[3]= "Orange";
		colors[2]= "Pink";
		
	}
	
	public ColorPoint() {
		color = "white";
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		
		int go=0;
		for(int i=0; i<colors.length; i++) {
			if(color.equals(colors[i])){
				go=1;	// given and stored color matches
				break;
			}
			else {
				go=0;   // given and stored color MISmatches
			}
		}
		
		if(go == 1) {
			this.color= color;    // assigns user given color 
		}
		else if(go == 0) {
			this.color= "white";
	}

}
	
	
	public String toString() {
		String str;
		str= super.toString()+" Color: "+color;
		return str;
	}
	
	
}
