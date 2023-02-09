package Ass1;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee e1= new Employee(101,"Prince",1,1,2022);
		
		Date d1= new Date(7,10,2022);
		
		Employee e2= new Employee(102,"Ganer",d1);
		Employee e3= new Employee(103,"Vinay",d1);
		Employee e4= new Employee(104,"Sonkar",d1);
		Employee e5= new Employee(105,"Omi",d1);
		Employee e6= new Employee(106,"Pisal",d1);
		
		e1.DisplayEmployee();
		e2.DisplayEmployee();
		e3.DisplayEmployee();
		e4.DisplayEmployee();
		e5.DisplayEmployee();
		e6.DisplayEmployee();

	}

}
