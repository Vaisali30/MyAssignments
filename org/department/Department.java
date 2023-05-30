package org.department;

import org.college.College;

public class Department extends College {

	public void deptName() {
		System.out.println("Computer Science and Application");
	}
	public static void main(String[] args) {
		Department dept= new Department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();
		
	}
}
