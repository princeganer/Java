package EmployeeDate;

public class DemoEmployee {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"Seeta",1,2,2000,2,2,2022);
		System.out.println(e1.display());
		Employee obj=new Employee();
		obj.display();
		Employee e2=new Employee(103,"Meeta",1,2,2000,2,2,2022);
		Employee e3=new Employee(104,"Geeta",1,2,2000,2,2,2022);
		Employee e4=new Employee(105,"Suresh",1,2,2000,2,2,2022);
		Employee e5=new Employee(106,"Naresh",1,2,2000,2,2,2022);
		Employee e6=new Employee(107,"Ramesh",1,2,2000,2,2,2022);
		Employee e7=new Employee(108,"Ganesh",1,2,2000,2,2,2022);
		System.out.println(e2.display());
		System.out.println(e3.display());
		System.out.println(e4.display());
		System.out.println(e5.display());
		System.out.println(e6.display());
		System.out.println(e7.display()+e1.display()+e2.display());
		
		
		
	}

}
