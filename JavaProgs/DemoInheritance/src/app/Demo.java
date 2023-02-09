package app;
import java.util.Scanner;

import utility.*;
public class Demo {

	public static void main(String[] args) {
		/*Employee e1=new Employee(101,"Seeta",5000);
		Manager mgr=new Manager(102,"Neeta",5000,100,200);
		System.out.println(e1.display());
		System.out.println(mgr.display());
	// ************* Accepting value through Keyboard**********
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Two Integer ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println(" Enter String ");
		String str=sc.next();
		System.out.println(" Number1 "+no1);
		System.out.println(" Number2 "+no2);
		System.out.println(" String  "+str);
    // ***********************************************************
		Employee e[]=new Employee[3];
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(" Enter Employee id ");
			
		}*/
		
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			int eid;
			String name;
			double sal;
			System.out.println(" Enter Employee Id ");
			eid=sc.nextInt();
			System.out.println(" Enter Employee Name ");
			name=sc.next();
			System.out.println(" Enter Employee Salary ");
			sal=sc.nextDouble();
			e[i]=new Employee(eid,name,sal);
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].display());
		}
		}
		
		

	

}
