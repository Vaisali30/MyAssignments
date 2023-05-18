package week3.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="stops";
		String text2="potss";
		
		int length1= text1.length();
		System.out.println("length of text1  "+length1);
		
		int length2=text2.length();
		System.out.println("length of text2  "+length2);
		
		if(text1.length()==text2.length()) {
			
			char[] charArray= text1.toCharArray();
			char[] charArray1= text2.toCharArray();
			
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
		
			
			if(Arrays.equals(charArray,charArray1)) {
				System.out.println("Given string is Anagram");
			}else {
				System.out.println("Given string is not Anagram");
			}

			

			
		}
		
		
		
		
	}

}
