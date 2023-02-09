package app_demo;

import utility.Manager;
import utility.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.displayEmp();
		
		Manager mgr1= new Manager();
		mgr1.displayEmp();
		
		Employee e2= new Employee(102, "Ravan", 70250.96);
		e2.displayEmp();
		
		Manager mgr2= new Manager(666, "Satan", 125000.63, 1000, 500);
		mgr2.displayEmp();

	}

}
