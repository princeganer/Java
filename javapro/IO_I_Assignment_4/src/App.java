
import java.io.FileNotFoundException;
import java.io.IOException;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException ,FileNotFoundException {
		
		FileOutputStream onm= new FileOutputStream ("C:/Hogwarts/javapro/sample.txt");
		FileInputStream inm= new FileInputStream("C:/Hogwarts/javapro/sample.txt");
		
		System.out.println("Enter the data");
		BufferedReader samp= new BufferedReader(new InputStreamReader(System.in));
		String str= samp.readLine();
		
		samp.close();
		onm.close();
		
	}

}