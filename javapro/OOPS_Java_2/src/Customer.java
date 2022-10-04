class Customer1{
	private int rno;
	private String name;
	private double avg;
	private static int count=100;
	
	public Customer1()
	{
		rno= ++count;
		name=null;
		avg=0;
	}
	
	public Customer1(String name) {
		rno= ++count;
		this.name=name;
		this.avg=0;
	}
	
	public Customer1(String name,double avg) {
		rno= ++count;
		this.name=name;
		this.avg=avg;
	}
	public void showDisplay(){
		System.out.println("Rno :"+rno+ " Name : " +name +" Avg : " +avg);
	}
}

public class Customer {

	public static void main(String[] args) {
		Customer1 s1=new Customer1("Seeta");
		Customer2 s2=new Customer1("Omi",69);
		Customer3 s3=new Customer1();
		Customer4 s4=new Customer1("Nithin");
		Customer5 s5=new Customer1("Raut");
		Customer10 s10=new Customer1("Kahut",108.21);
		
		s1.showDisplay();
		s2.showDisplay();
		s3.showDisplay();
		s4.showDisplay();
		s5.showDisplay();
		s10.showDisplay();
	}

}
