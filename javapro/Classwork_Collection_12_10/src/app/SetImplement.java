package app;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplement {

	public static void main(String[] args) {
	
		Set <Integer> fir= new LinkedHashSet<>();
		fir.add(20);
		fir.add(60);
		fir.add(30);
		fir.add(90);
		fir.add(10);
		System.out.println("Linked Hash Set (insertion order");
		System.out.println((fir));
		
		
		Set <Integer> sec= new TreeSet<>();
		sec.add(20);
		sec.add(60);
		sec.add(30);
		sec.add(60);
		sec.add(10);
		System.out.println("Tree Set (insertion order");
		System.out.println((sec));
		
		

	}

}
