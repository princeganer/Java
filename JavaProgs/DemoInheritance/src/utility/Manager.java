package utility;

public class Manager extends Employee{
	private double allow,incen;
	public Manager()
	{
		
	}
	public Manager(int eid,String name,double sal,double all,double inc)
	{
		super(eid,name,sal);
		this.allow=all;
		this.incen=inc;
	}
	public String display()
	{
		String str=super.display()+"\tAllow : "+allow+"\tIncentives : "+incen;
		return str;
	}
	

	
}
