
import java.io.*;

public class App {

	public static void main(String[] args) throws IOException {
		
		BufferedReader samp= new BufferedReader(new InputStreamReader(System.in));
		
		int i=10;
		//T his logic is not as per the question statement.
		while(i!=0) {
			System.out.println("Enter the string");
			String str= samp.readLine();
			System.out.println((String)str);
			
			if(str.equals("quit")) {
				i=0;
				break;
			}
		}
	}

}
