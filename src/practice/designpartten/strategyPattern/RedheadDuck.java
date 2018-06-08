package practice.designpartten.strategyPattern;


public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I am a Red head duck");
		
	}

}
