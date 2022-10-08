// Rno: 10 Name:
class Student
{
	private int rno;
	private float avg;
	private String name;
	public Student()
	{
		rno=0;
		avg=0;
		name=null;
	}
	public Student(int rno,float avg,String name)
	{
		this.rno=rno;
		this.avg=avg;
		this.name=name;
	}
	public void display()
	{
		System.out.println(" ----------------------------");
		System.out.println(" Rno  : "+rno);
		System.out.println(" Avg  : "+avg);
		System.out.println(" Name : "+name);
		System.out.println(" ----------------------------");
	}
	public static void hello()
	{
		System.out.println(" Hello");
	}
}
public class DemoStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		
		Student s2=new Student(101,96.78f,"Geeta");
		s2.display();
		
		s2.hello();
		Student.hello();
		//Student.display();
				
		
	}

}
