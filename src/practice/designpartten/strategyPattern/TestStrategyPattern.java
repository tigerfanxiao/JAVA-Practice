package practice.designpartten.strategyPattern;

public class TestStrategyPattern {
	public static void main(String[] args) {
		// separate fly behavior from super class
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("-----------------");
		// dynamically change the fly way from flying to can't fly
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		redheadDuck.performFly();
		redheadDuck.setFlyBehavior(new FlyNoWay());
		redheadDuck.performFly();
	}
}
