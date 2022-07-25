package week1.day1;


public class EmployeeDetails {
	public void printName(String name) {
		System.out.println(name);
	}
	public void printId(int number) {
		System.out.println(number);
	}
	public void printPhoneNumber(long number) {
		System.out.println(number);
	}
	public void printsalary(double number) {
		System.out.println(number);
	}
	public void printEmailAdd(String name) {
		System.out.println(name);
	}
	public void printAddress(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		EmployeeDetails std=new EmployeeDetails();
		std.printId(101);
		std.printName("Nandhi Shree");
	    std.printPhoneNumber(99530);
	    std.printAddress("Chennai");
	    std.printEmailAdd("nandhi@gamil.com");
	    std.printsalary (30000);
	}
}
