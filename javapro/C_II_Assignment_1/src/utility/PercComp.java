package utility;

import java.util.Comparator;

public class PercComp implements Comparator <Student>{
	
	@Override
	public int compare (Student s1, Student s2) { // NOT compareTo,
		if(s1.getPerc()>s2.getPerc())			  // its for same class
			return 1;
		/*
		    if(s2.getPerc()>s1.getPerc())	// for Ascending sort
			return 1;                       // higher at top
		 */
		else 
			return -1;
	}

}
