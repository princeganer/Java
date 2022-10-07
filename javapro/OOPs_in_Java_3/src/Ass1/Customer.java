package Ass1;

public class Customer {
	private String emailid;
	private Address addr;
	
	public Customer(){
		emailid= null;
		addr= new Address();
	}
	
	public Customer(String emailid, String area,String city, String pin){
		this.emailid= emailid;
		/*this.addr= addr;*/
		addr=new Address(area,city,pin);
	
	}
	
	public void displayCust() {
		System.out.println("Email-Id  "+emailid);
		addr.Display1();
	}
	
	
	
}
