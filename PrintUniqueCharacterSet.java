package week5.day4;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacterSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Vaishali";
		char[] charArray = name.toCharArray();
	
		Set<Character> uniqueCharacter1= new HashSet<Character>();
		Set<Character> uniqueCharacter2= new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			uniqueCharacter1.add(charArray[i]);
		}
	      System.out.println(uniqueCharacter1);
	
	      for (int j = 0; j < charArray.length; j++) {
	    	  uniqueCharacter2.add(charArray[j]);
		}
	      System.out.println(uniqueCharacter2);
	
	}

}
