package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
	
		int[] veg= {3,2,11,4,6,7};
		 int[] nonveg= {1,2,8,4,9,7};
		 for (int i = 0; i < veg.length; i++) {
			 for (int j = 0; j < nonveg.length; j++) {
				
				 if(veg[i]==nonveg[j]) {
					 
					 System.out.println(nonveg[j]);
					 
				 }
			}
			
		}

	}

}
