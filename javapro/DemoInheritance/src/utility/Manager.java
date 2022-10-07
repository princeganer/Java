package utility;

public class Manager extends Employee{
	private double allow, incen;
	
	public Manager() {
		super();
		allow=10.0;
		incen=1.0;
	}

	public Manager(int eid, String name, double salary, double allow, double incen) {
		super(eid, name, salary);
		//this.eid= eid;  wrong, dont 	
		this.allow = allow;
		this.incen = incen;
	}
	
	public void displayEmp() {
		super.displayEmp();
		System.out.println("Allowances: "+ allow +" Incentives: "+ incen);
	}
	
	public void shoInheritence() {
		super.fun();
		
		System.out.println("Allowances: "+ allow +" Incentives: "+ incen);
	}
	
}
