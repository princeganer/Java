package assignment1_1.utility;

public class Emp extends Person {
	private int eid;
	protected double salary;  // protected Not private
	
	public Emp() {
		super();
	}

	public Emp(String name, String address, int pin, int eid, double salary) {
		super(name, address, pin);
		this.eid = eid;
		this.salary = salary;
	}
	
	public double calSalary() {
		return salary;
	}
	
	public String toString() {
		String str;
		str= "@Employee "+super.toString()+" Eid: "+eid+" Salary: "+salary;
		return str;
	}
	
}
