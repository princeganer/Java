package Assignment1;

public class Person {
	private String name;
	private String city;
	private int pin;
	
	public Person() {
		this.name = null;
		this.city = null;
		this.pin= 440001;
	}
	
	public Person(String name,  String city, int pin) {
		this.name = name;
		this.city = city;
		this.pin= pin;
	}
	
	public String display() {
		String str;
		str= " Name : "+ name +" City : "+ city+ " Pin :"+pin;
		return str;	
	}
	
	public String toString() {
		String str;
		str= display();
		return str;
	}
	
	
}
