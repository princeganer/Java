/*
 * Assignment 1: 
 */

class Date{
	private int day, month ,year;
	
	public void showDate() {
		System.out.println("The Date is "+day+"/"+month+"/"+year);
	}
	
	public void showDate(char z) {
		System.out.println("The Date is "+day+z+month+z+year);
	}
	
	public Date() {    // No arguments constructor
		day= month= 1;
		year= 2022;
	}
	
	public Date(int d, int m, int y) {    // Parameterized constructor
		System.out.println("Parameterised constructor");
		day= d;
		month= m;
		year= y;
	}
	
	public Date(Date obj) {
		System.out.println("obj constructor ");
		this.day= obj.day;
		this.month= obj.month;
		this.year= obj.year;
	}
	
	
}

public class ModelDate {
	
	public static void main(String[] args) {
		
		Date d1= new Date();
		d1.showDate();
		
		Date d2= new Date(10, 12, 2023);
		d2.showDate();
		
	    Date d3= new Date(d1);   // copy constructor, copies the entire data
	    d3.showDate();
	    
	    Date d4= new Date();   
	    d4.showDate('@');
	}
    
}
