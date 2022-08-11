package org.College;

public class Student extends Depatment{
//studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Dept");
	}
	public void studentId() {
		System.out.println("Student Id");
	}
public static void main(String[] args) {
	Student student = new Student();
	//collegeName(),collegeCode(),collegeRank()
	student.collegeName();
	student.collegeCode();
	student.collegeRank();
	student.deptName();
	student.studentDept();
	student.studentId();
	student.studentName();
}
}
