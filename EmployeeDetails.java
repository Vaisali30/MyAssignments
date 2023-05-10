package week2.day3;

public class EmployeeDetails {
	
	public void getEmployeeName(String empName) {
		System.out.println("Name of an Employee : "+empName);
		
	}
	
	public void getEmployeeId(int empId) {
		System.out.println("Employee Id Number :"+empId);
	}
   
	public void getEmployeeAddress(String empAddress) {
	System.out.println("Address of an Employee :"+empAddress);
}
    
	public void getEmployeeSalary(double empSalary){
	System.out.println("Salary of an Employee :"+empSalary);
	
}
    
	public void getEmployeeMobileNo(long mobNum) {
	 System.out.println("Employee contact number :"+mobNum);
 }

    public static void main(String[] args) {
	EmployeeDetails worker =new EmployeeDetails();
	
	      worker.getEmployeeName("Vaishali");
	      worker.getEmployeeId(5621);
	      worker.getEmployeeAddress("Ladakh");
	      worker.getEmployeeSalary(69258.32);
	      worker.getEmployeeMobileNo(9925148632L);

 
 }
 
 
 
 
}
