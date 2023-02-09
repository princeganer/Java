
import java.io.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		BufferedReader sampl= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Characters: ");
		
		int /*ch0='Q'*/ ch1='q';
 		while( (ch1=sampl.read())!='q' ) {
 			System.out.println((char)ch1);
 		}
		
	}

}
