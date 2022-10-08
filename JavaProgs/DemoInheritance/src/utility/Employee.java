package utility;

public class Employee {
	private int eid;
	private String name;
	private double salary;

	public Employee() {

	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public String display() {
		String str;
		str = "\tEid : "+eid + "\tName : " + name + "\tSalary : " + salary;
		return str;
	}

}
