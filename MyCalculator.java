package week2.day3;

public class MyCalculator {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println("Additon of two numbers ="+c);
		
	}
	public void subractionTwoNumbers(int e,int f) {
		int d=e-f;
		System.out.println("Subraction of two numbers ="+d);
	}
	public void multipleTwoNumbers(double i,double j) {
		double g=i*j;
		System.out.println("Multiplication of two numbers ="+g);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println("Division of two numbers ="+z);
	}
	
public static void main(String[] args) {
	MyCalculator calc =new MyCalculator();
	calc.additionTwoNumbers(50, 60);
     calc.subractionTwoNumbers(125,60);
     calc.multipleTwoNumbers(5621.86, 4169.21);
     calc.divideTwoNumbers(900.98f,562.82f);

}
}