package Assignment1;

public class Demo {

	public static void main(String[] args) {
		
		Emp e1= new Emp();
		e1.display();
		
		Emp e2= new Emp("Seeta", "Nagpur", 441106, 520, 56301.36);
		e2.display();
		
		Person p[]= new Person[2];
		p[0]= new Person("Kasto", "PenC", 402107);    // refer for Person class
		p[1]= new Emp("Basto", "CenPen", 402207, 420, 542.01);    // refer for Emp class
		                                             // Left side has base class reference
		
		for(int i=0; i<=1; i++) {
			System.out.println(p[i].display());
			System.out.println();
		}
	}

}
