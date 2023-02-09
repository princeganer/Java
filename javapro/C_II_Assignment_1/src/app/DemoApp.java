package app;
import utility.*;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import utility.Student;

public class DemoApp {

	public static void main(String[] args) {

		Set <Student> stu= new LinkedHashSet <Student>();
		stu.add(new Student());
		stu.add(new Student("Rahul","Nasik", 77.36));  // added an object to stu LinkedHashSet
		stu.add(new Student("Ajay","Pune", 73.33));
		stu.add(new Student("Vijay","Beed", 65.99));
		stu.add(new Student("Sujay","Raipur", 45.66));

		for(Student s: stu) {
			System.out.println(s); // s iterates over stu
		}

		System.out.println("***************After city sort********************************");

		Set <Student> stu2= new TreeSet <Student>(new CityComp());
		stu2.add(new Student());
		stu2.add(new Student("Rahul","Nasik", 77.36));  // added an object to stu LinkedHashSet
		stu2.add(new Student("Ajay","Pune", 73.33));
		stu2.add(new Student("Vijay","Beed", 65.99));
		stu2.add(new Student("Sujay","Raipur", 45.66));

		for(Student s: stu2) {
			System.out.println(s); // s iterates over stu
		}

		System.out.println("***************After Perc sort********************************");

		Set <Student> stu3= new TreeSet <Student>(new PercComp());
		stu3.add(new Student());
		stu3.add(new Student("Rahul","Nasik", 77.36));  // added an object to stu LinkedHashSet
		stu3.add(new Student("Ajay","Pune", 73.33));
		stu3.add(new Student("Vijay","Beed", 65.99));
		stu3.add(new Student("Sujay","Raipur", 45.66));

		for(Student s: stu3) {
			System.out.println(s); // s iterates over stu
		}
		
		System.out.println("***************After Name sort********************************");

		Set <Student> stu4= new TreeSet <Student>();
		stu4.add(new Student());
		stu4.add(new Student("Rahul","Nasik", 77.36));  // added an object to stu LinkedHashSet
		stu4.add(new Student("Ajay","Pune", 73.33));
		stu4.add(new Student("Vijay","Beed", 65.99));
		stu4.add(new Student("Sujay","Raipur", 45.66));

		for(Student s: stu4) {
			System.out.println(s); // s iterates over stu
		}
		
	}

} 
