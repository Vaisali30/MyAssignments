package week2.day1;

public class Mobile {
	
	
	String mobileBrandName="Samsung Galaxy";
			char mobileLogo='S';
	        short noOfMobilePiece=10;
	        int modelNumber=785258;
	        long mobileIMEINumber=96321547824L;
	        float mobilePrice=25000.65F;
	        boolean isDamaged=true;
	
	
	
	
	
	public static void main(String[] args) {
		Mobile Samsung =new Mobile();
		System.out.println(Samsung.mobileBrandName);
		System.out.println(Samsung.mobileLogo);
		System.out.println(Samsung.noOfMobilePiece);
		System.out.println(Samsung.modelNumber);
		System.out.println(Samsung.mobileIMEINumber);
		System.out.println(Samsung.mobilePrice);
		System.out.println(Samsung.isDamaged);
	}

}
