package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Vaishali.S");
	}
	
	public void studentDept() {
		System.out.println("Information Technology");
	}
	
	public void studentId() {
		System.out.println("18UIT029");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
	}

}
