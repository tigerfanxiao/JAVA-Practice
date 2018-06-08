package practice.designpartten.strategyPattern;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Duck flying");

	}

}
