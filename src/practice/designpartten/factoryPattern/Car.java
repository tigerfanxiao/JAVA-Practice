package practice.designpartten.factoryPattern;

public class Car extends Vehicle {
	
	public Car() {
		name = "Car";
	}
	
	@Override
	public void run() {
		System.out.println("running on the road!");

	}

}
