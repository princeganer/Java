class Stud1{
	private int rno;
	private String name;
	private double avg;
	private static int count;
		
	public static void count()
	{
		count=100;
	}
	
	public Stud1()
	{
		rno= ++count;
		name=null;
		avg=0;
	}
	
	public Stud1(String name) {
		rno= ++count;
		this.name=name;
		this.avg=0;
	}
	
	public Stud1(String name,double avg) {
		rno= ++count;
		this.name=name;
		this.avg=avg;
	}
	public void showDisplay(){
		System.out.println("Rno :"+rno+ " Name : " +name +" Avg : " +avg);
	}
}

public class SavlaStud {

	public static void main(String[] args) {
		Stud1 s1=new Stud1("Seeta");
		Stud1 s2=new Stud1("Omi",69);
		Stud1 s3=new Stud1();
		Stud1 s4=new Stud1("Nithin");
		Stud1 s5=new Stud1("Raut");
		Stud1 s10=new Stud1("Kahut",108.21);
		
		s1.showDisplay();
		s2.showDisplay();
		s3.showDisplay();
		s4.showDisplay();
		s5.showDisplay();
		s10.showDisplay();
	}

}
