package assignment1_1.utility;

public class Person {
	private String name, address;
	private int pin;
	
	public Person() {
		name= "null";
		address= "null";
		pin= 411021;
	}

	public Person(String name, String address, int pin) {
		this.name = name;
		this.address = address;
		this.pin = pin;
	}
	
	public String toString() {
		String str;
		str= "Name: "+name+" Address: "+address+" Pin: "+pin;
		return str;
	}	

}
