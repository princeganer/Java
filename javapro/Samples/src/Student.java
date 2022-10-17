import java.io.Serializable;

public class Student implements Serializable {
	int rno;
	String name;
	double perc;
	
	public Student() {
	}

	public Student(int rno, String name, Double perc) {
		this.rno = rno;
		this.name = name;
		this.perc = perc;
	}
	
	@Override
	public String toString() {
		return "Student [Rno:" + rno + ", Name:" + name + ", Percentage:" + perc + "]";
	}

}
