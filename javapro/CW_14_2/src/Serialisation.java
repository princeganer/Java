import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialisation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student s1= new Student(407, "Joni", 69.70);
		ObjectOutputStream out= new ObjectOutputStream( new FileOutputStream("C:/Hogwarts/javapro/student.dat"));
		
		out.writeObject(s1);
		System.out.println("data inserted");
		out.close();
	}
}
 