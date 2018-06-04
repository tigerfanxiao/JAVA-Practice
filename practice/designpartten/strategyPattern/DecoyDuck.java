package practice.designpartten.strategyPattern;


public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		// add specific fly behavior
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("I am a Decoy duck, not a real duck");
	}
	
	
}
