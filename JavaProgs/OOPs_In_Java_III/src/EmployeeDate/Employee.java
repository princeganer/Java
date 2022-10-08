package EmployeeDate;

public class Employee {
		
	private int eid;
	private String name;
	private Date dob,doj;
	public Employee()
	{
		eid=0;
		name=" ";
		dob=new Date();
		doj=new Date();
	}
	public Employee(int eid,String name,int d,int m,int y,int d1,int m1,int y1)
	{
		this.eid=eid;
		this.name=name;
		this.dob=new Date(d,m,y);
		this.doj=new Date(d1,m1,y1);
	}
	public String display()
	{
		return "\n"+eid+"\t"+name+"\t"+dob.display()+"\t"+doj.display();
		
	}
			


}
