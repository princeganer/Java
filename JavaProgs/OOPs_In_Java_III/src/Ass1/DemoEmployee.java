package Ass1;

public class DemoEmployee {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"Seeta",1,2,2000);
		e1.display();
		Employee obj=new Employee();
		obj.display();
		Date d2=new Date(2,2,2000);
		Employee e2=new Employee(103,"Meeta",d2);
		Employee e3=new Employee(104,"Geeta",d2);
		Employee e4=new Employee(105,"Suresh",d2);
		Employee e5=new Employee(106,"Naresh",d2);
		Employee e6=new Employee(107,"Ramesh",d2);
		Employee e7=new Employee(108,"Ganesh",d2);
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		e6.display();
		e7.display();
		
		
		
	}

}
