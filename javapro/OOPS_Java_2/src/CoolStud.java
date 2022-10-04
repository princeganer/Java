class Stud{
	private int rno;
	private String name;
	private double avg;
	private static int count=0;
		
	public Stud()
	{
		rno= ++count;
		name=null;
		avg=0;
	}
	
	public Stud(String name) {
		rno= ++count;
		this.name=name;
		this.avg=0;
	}
	
	public Stud(String name,double avg) {
		rno= ++count;
		this.name=name;
		this.avg=avg;
	}
	public void showDisplay(){
		System.out.println("Rno :"+rno+ " Name : " +name +" Avg : " +avg);
	}
}

public class CoolStud {

	public static void main(String[] args) {
		Stud s1=new Stud("Seeta");
		Stud s2=new Stud("Omi",69);
		Stud s3=new Stud();
		Stud s4=new Stud("Nithin");
		Stud s5=new Stud("Raut");
		Stud s10=new Stud("Kahut",108.21);
		
		s1.showDisplay();
		s2.showDisplay();
		s3.showDisplay();
		s4.showDisplay();
		s5.showDisplay();
		s10.showDisplay();
	}

}
