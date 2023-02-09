package Assignment1;

public class Emp extends Person {
	private int empid;
	private double salary;
	
	public Emp() {
		super();
		empid = 0;
		salary = 0;
	}

	public Emp(String name, String city, int pin, int empid, double salary) {
		super(name, city, pin);
		this.empid = empid;
		this.salary = salary;
	}
	
	public String display() {
		String str;
		str= "EmpID : "+empid+" Salary : "+salary+super.display();
		return str;
	}
	
	
}
