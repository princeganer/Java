package Ass1;

public class Employee {
	private int eid;
	private String name;
	private Date dob;
	public Employee() {
		eid=0;
		name=null;
		dob=null;
	}
	public Employee(int eid,String name,int day,int month,int year)
	{
		this.eid=eid;
		this.name=name;
		dob=new Date(day,month,year);
	}
	public Employee(int eid, String name, Date dob) {
		super();
		this.eid = eid;
		this.name = name;
		this.dob = dob;
	}
	public void display()
	{
		System.out.println("----------------------------");
		System.out.println(" Employee Id : "+eid);
		System.out.println(" Name  : "+name);
		//System.out.println(" Date  : "+dob);
		dob.display();
		
	}
	

}
