package utility;

public class Student {
	int rno;
	String name;
	
	public Student() {
	}

	public Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", Name=" + name + "]";
	}

}
