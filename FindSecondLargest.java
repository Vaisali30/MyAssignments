package week5.day4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		    //a) Create a empty Set Using TreeSet
            Set<Integer> largestNum = new TreeSet<Integer>();

		    //declare for loop iteration from 0 to number and add into set
		    for (int i = 0; i < data.length; i++) {
			largestNum.add(data[i]);

			//convert set into list
			List<Integer> secondLargest =new ArrayList<Integer>(largestNum);

			//print the secondLargest number from list
			int size =  secondLargest.size();
			System.out.println(size);

			System.out.println(secondLargest.get(secondLargest.size()-2));
		}






	}

}
