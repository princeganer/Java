package utility;

public class Student implements Comparable<Student>{
	private String name, city;
	private double perc;
	
	public Student() {
		name= "unknown";
		city= "Secunderabad";
		perc= 37.5;
	}
	
	public Student(String name, String city, double perc) {
		this.name = name;
		this.city = city;
		this.perc = perc;
	}
	
	// Getter for use in Comparator
	// Comparator and Comparable can
	
	public String getCity() {
		return city;
	}

	public double getPerc() {
		return perc;
	}
	
	// code for comparable
	public int compareTo (Student s) {
		return this.name.compareTo(s.name);
	}
	
	//
	
	// hashcode NOT Done !!!!!!!
	public int hashCode() {
		return city.hashCode();  // Converted from String to int
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", perc=" + perc + "]"+"\n";
	}	
	
}
