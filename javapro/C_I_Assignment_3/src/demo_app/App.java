package demo_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int choice= 75;
		
		ArrayList <String> store= new ArrayList<>();
		
		Scanner sc= new Scanner(System.in);

		while(choice!=0) {
			
			System.out.println("**********************************");
			System.out.println("1. Accept a string");
			System.out.println("2. Display a string ");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. Modify");
			System.out.println("6. Sort");
			System.out.println("0. EXIT");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				System.out.println("Enter name");
				String ad= sc.next();
				store.add(ad);
				System.out.println(store);
				break;
			}
			
			case 2:{
				System.out.println(store);
				break;
			}
			
			case 3:{
				System.out.println("Enter String to b searched");
				String str= sc.next();
				
				if(store.contains(str)) {
					System.out.println("String is zinda at index " + store.indexOf(str));
				}
				else
					System.out.println("Not Available Bhaiya");
			
				break;
				
			}
			case 4:{
				System.out.println("enter the index no to b removed");
				int no = sc.nextInt();
				store.remove(no);
				System.out.println(store);
				break;
			}
			
			case 5:{
				System.out.println("Enter the index and string");
				
				int no = sc.nextInt();
				store.remove(no);
				
				String ad= sc.next(); // scanner for d String
				store.add(no, ad);
				break;
			}
			
			case 6:{
				Collections.sort(store);
				System.out.println(store);
				break;
			}
			
			case 0:
				System.out.println("Khatam by bai ghari ja");
				break;
			}
		}
	}

}

