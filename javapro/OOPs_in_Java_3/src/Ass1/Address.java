package Ass1;

public class Address {
	private String area, city, pin;
	
	public Address(){
		area= null;
		city= null;
		pin = null;
	}
	
	public Address(String area, String city, String pin){
		this.area= area;
		this.city= city;
		this.pin = pin;
	}
	public void Display1(){
		System.out.println("Area :  "+area+ "City : "+city+ "  pin : "+pin);
	}

}
