package practice.designpartten.factoryPattern;

public class Plane extends Vehicle{
	public Plane() {
		name = "Plane";
	}
	@Override
	public void run() {
		System.out.println("flying in the sky!");
		
	}

}
