package assignment1_1.utility;

public class Admin extends Emp{
	private float bonus;
	
	public Admin()
	{
		super();
		
	}
	
	public Admin(String name, String address, int pin, int eid, double salary,float bonus) {
		super(name,address,pin,eid,salary);
		this.bonus=bonus;
	}
	
	public String toString() {
		String str;
		str="Admin: "+super.toString()+"  Bonus: "+bonus;
		return str;
	}
}
