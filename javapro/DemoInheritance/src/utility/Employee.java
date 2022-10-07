package utility;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	
	public Employee() {
		eid=00;
		name= null;
		salary= 00.00;
	}
	
	public Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public static void fun() {
		System.out.println("fun function is inherited in Manager");
	}
	
	public void displayEmp() {
		System.out.println("EId : "+eid+" Name : "+name+" Salary : "+salary);
	}
	
	
}
