/*
 * Assignment 2: 
 * */
class Date2{
	private int day, month ,year;
	
	public void showDate() {    // method
		System.out.println("The Date is "+day+"/"+month+"/"+year);
	}
	
	public Date2() {    // No arguments constructor
		day= month= 1;
		year= 2022;
	}
	
	public Date2(int d, int m, int y) {    // Parameterized constructor 
		day= d;
		month= m;
		year= y;
	}
	
	public Date2(Date2 obj) {    // Say, Date2 is like a datatype. must b specified.
		this.day= obj.day;       // object is passed as parameter here
		this.month= obj.month;
		this.year= obj.year;
	}
}

public class ModelDate2 {

	public static void main(String[] args) {
		Date2 d1= new Date2();
		d1.showDate();
		
		Date2 d2= new Date2(d1);
		d2.showDate();

	}

}
