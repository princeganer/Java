package assignment1_1.utility;

public class Programmer extends Emp{
 private float extra_hours;
 private double charges_hours;
 
 public Programmer()
 {
	 super();
	 extra_hours= 1f;
	 charges_hours=10;
 }
 
 public Programmer(String name, String address, int pin,
		 			int eid, double salary,float extra_hours,double charges_hours)
 {
	 super(name,address,pin,eid,salary);
	 this.extra_hours=extra_hours;
	 this.charges_hours=charges_hours;
	 
 }
 
 public double calSalary() {
	 return super.salary + extra_hours*charges_hours; // try salary, Not super.salary
 }
 
 public String toString()
 {
	 String str;
	 str= "Progranmmer: "+super.toString()+"  Extra_hrs: "+extra_hours+"  Charges_hours: "+charges_hours;
	 return str;
 }
 
}
