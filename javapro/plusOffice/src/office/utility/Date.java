package office.utility;

public class Date {

	private int day, month ,year;

	public void showDate() {    // method
		System.out.println("The Date is "+day+"/"+month+"/"+year);
	}

	public Date() {    // No arguments constructor
		day= month= 1;
		year= 2022;
	}

	public Date(int d, int m, int y) {    // Parameterized constructor 
		day= d;
		month= m;
		year= y;
	}

	public Date(Date obj) {    // Say, Date2 is like a datatype. must b specified.
		this.day= obj.day;       // object is passed as parameter here
		this.month= obj.month;
		this.year= obj.year;
	}
}
