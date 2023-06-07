package week5.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] values= {"Google","Microsoft","Testleaf","Maverick"};
	
		int length = values.length;
	    System.out.println(length);
	
	    List<String> sortByCollection = new ArrayList<String>();
	    Collections.sort(sortByCollection);
	    
	    for(int i=values.length-1;i>=0;i--) {
	    	System.out.println(values[i]);
	    }
	
	
	
	
	
	}
}
