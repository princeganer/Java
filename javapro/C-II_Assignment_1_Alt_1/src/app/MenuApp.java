package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import utility.PercComp;
import utility.Student;

public class MenuApp {

	public static void main(String[] args) {  // TWO Mains!!!!
		List <Student> stu= new ArrayList <Student>();
		stu.add(new Student());
		stu.add(new Student("Rahul","Nasik", 77.36));  // added an object to stu LinkedHashSet
		stu.add(new Student("Ajay","Pune", 73.33));
		stu.add(new Student("Vijay","Beed", 65.99));
		stu.add(new Student("Sujay","Raipur", 45.66));

		for(Student s: stu) {
			System.out.println(s); // s iterates over stu
		}
		
		int choice=69;
		do {
			System.out.println("***************************");
			System.out.println("1.Name Sort");
			System.out.println("2.Percentage Sort");
			System.out.println("3.City Sort");
			System.out.println("0 EXIT");
			System.out.println("Enter your Choice");
			
			Scanner st= new Scanner(System.in);
			choice = st.nextInt();
			
			System.out.println("***************************");
			
			switch(choice){
				case 1:
					Collections.sort(stu, new Student());
					break;
				case 2:
					Collections.sort(stu, new PercComp());
					break;
				case 3:
					Collections.sort(stu, new PercComp());
					break;
				default:
					break;
					
			}
			
		}while(choice);

	}

}
