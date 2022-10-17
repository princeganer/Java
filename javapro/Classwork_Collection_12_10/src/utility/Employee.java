package utility;

public class Employee {
	int eid;
	String name;
	double sal;
	
	public Employee() {
	}

	public Employee(int eid, String name, double sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
