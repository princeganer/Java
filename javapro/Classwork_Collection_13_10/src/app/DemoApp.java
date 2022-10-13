package app;

import java.util.Map;
import java.util.TreeMap;

public class DemoApp {

	public static void main(String[] args) {
		
		String str= "Mahabharat";
		
		Map <Character, Integer> wip = new TreeMap<>();
		
		for(int i=0; i<str.length(); i++) {
			Character ch = str.charAt(i);
			if(wip.containsKey(ch)) {
				int no= wip.get(ch);
				wip.put(ch, ++no);
			}
			else {
				wip.put(ch,i);
			}
		}
		
		System.out.println(wip);
		
		
		//for(DemoApp s: wip) {
		//	System.out.println(s);
		}
	}

