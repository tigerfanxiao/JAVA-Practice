package practice.designpartten.factoryPattern;

public class Boat extends Vehicle{
	
	public Boat() {
		name = "Boat";
	}
	@Override
	public void run() {
		System.out.println("shipping in the sea");
		
	}

}
