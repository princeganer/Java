package Ass1;

public class DemoPerson {

	public static void main(String[] args) {
		
		Person p1= new Person();
		p1.displayBdate();    // containment from Date class 
		
		Person p2 = new Person("Akshay",22,8,1996);
		p2.displayBdate();
		

		Person p3 = new Person("lata",11,11,2011); // Date object created in this class and passed as arg. 
		p3.displayBdate();
		
		Person p4 = new Person();
		p4.displayBdate();
	}

}
