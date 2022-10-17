package app;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList <String> store = new ArrayList<>();
		System.out.println("---------------------------");
		store.add("vinay");    // added to list
		store.add("prince");
		store.add("kaustubh");
		store.add("vaibhav");
		
		System.out.println(store);  // display names
		System.out.println(store.size());   // displays no of elements
		
		store.add(3, "Patil");
		System.out.println(store);
		
		store.add(4, "Omkar");  //added Omkar at index 3
		System.out.println(store);
		
		store.remove("Patil");  // removing using data
		System.out.println(store);
		
		store.remove(4);
		System.out.println(store);		

	}
}