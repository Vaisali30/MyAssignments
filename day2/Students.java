package week5.day2;

public class Students {
	
	public void getStudentInfo(int stuId) {
		System.out.println("Id of an Student --> "+stuId);
		}
	
	public void getStudentInfo(int stuId , String stuName ) {
		System.out.println("Student id--> " +stuId+ " , Student Name-->"+stuName);	
	}
	
	public void getStudentInfo(String emailId , long phoneNumber) {
		System.out.println("Email ID --> "+emailId + " , Phone Number-->"+phoneNumber);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu = new Students();
    
		stu.getStudentInfo(18156);
		stu.getStudentInfo(18156, " S.Vaishali");
		stu.getStudentInfo("Vaishufoodie@gmail.com " ,1234567890 );
		
		
		
	}

}
