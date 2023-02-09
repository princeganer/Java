package assignment1_1.utility;

public class SalesManager extends Emp{
	private int target;
	private double incentive;
	
	public SalesManager()
	{
		super();
		target=15;
		incentive=20.5;
		
	}
	
	public SalesManager(String name, String address, int pin, int eid,
						double salary,int target, double incentive)
	{
	 super(name,address,pin,eid,salary);
	 this.target=target;
	 this.incentive=incentive;
	}
	
	public double calSalary() {
		 return super.salary + target*incentive;
	 }
	
	public String toString()
	{
		String str;
		str="SalesManager: "+super.toString()+"  Target: "+target+"  Incentive: "+incentive;
		return str; 
	}
	
	

}
