package Ass1;

public class Date {
	private int day, month , year;
	private static int count= 0;
	
	
	public Date(){
		day = month = 1;
		year= 2022;
		count= ++count;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		count= ++count;
	}
	
	public void Display() {
		System.out.println("Date : "+day+ "/" +month+ "/" +year);
	}
	
	public static void showCount() {
		System.out.println(count);
	}

}
