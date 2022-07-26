package week1.day1;

public class Car {

	public void applyBrake( ) {
		System.out.println("Brake");
	
	}
	public void applyGear( ) {
		System.out.println("Gear");
		
	}
	public void switchOnAc( ) {
		System.out.println("On");
		
	}
	public void applyAcclerate ( ) {
		System.out.println("Acclerate");
		
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.applyBrake();
		car.applyGear();
		car.switchOnAc();
		car.applyAcclerate();
	}
}
