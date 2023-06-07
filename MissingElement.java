package week5.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number= {1,2,3,4,6,7,8,1,2,3};

		Set<Integer> uniqueNumber = new LinkedHashSet<Integer>();

		for (int i = 0; i < number.length; i++) {
			uniqueNumber.add(number[i]);
		}
		System.out.println(uniqueNumber);

		List<Integer> missingElement =new ArrayList<Integer>(uniqueNumber);

		for (int i = 0; i < missingElement.size(); i++) {
			if(missingElement.get(i+1)!= missingElement.get(i)+1) {
				System.out.println(missingElement.get(i)+1);
				break;
			}

		}

	}


}















