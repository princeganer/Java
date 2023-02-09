package office.staff;
import utility.Date;

public class Person {
	
	private String name;
	private Date bdate; // date is a data type of bdate same as int.
	
	public Person(){
		super();
		name=null;
		bdate= new Date(); // object assign to a variable 
	}
	
	public Person(String name,int d, int m , int y) {
		
		super();
		this.name = name;
		this.bdate = new Date(d, m, y);
	}
	
	public void displayBdate() {
		System.out.println("Name : "+name);
		bdate.Display();
	}

}
