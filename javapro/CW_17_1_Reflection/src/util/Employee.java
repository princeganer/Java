package util;

public class Employee {
	private int eid;
	private static int count;
	private String name;
	private double salary;

	static {
		count=100;
	}

	public Employee(){
		eid= count++;
		name=null;
		salary=56;
	}

	public Employee(int eid, String name, double salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	
	public Employee(String name, double salary){
		eid=count++;
		this.name=name;
		this.salary=salary;
	}
	
	public int getEid(){
		return eid;
	}

	public String toString() {
		return "Eid: "+eid+ " Name: "+name+" Salary: "+salary+"\n";
	}
	
}

