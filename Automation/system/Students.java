package org.College;

public class Students {
//  Class: Students
   // Methods: getStudentInfo()
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
public void getStudentInfo(String name) {
		System.out.println(name);
	}
public void getStudentInfo(int id,String email) {
	System.out.println(id+"   "+email);
}
public void getStudentInfo(long id) {
	System.out.println(id);
}
public static void main(String[] args) {
	Students std=new Students();
	std.getStudentInfo(101);
	std.getStudentInfo("Kani");
	std.getStudentInfo(101,"abc@gmail.com");
	std.getStudentInfo(9087475953l);
}
}

