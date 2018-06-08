/*
 * the abstract supper class for the all kind of ducks
 */
package practice.designpartten.strategyPattern;

public abstract class Duck {
	// these instance could be used by any subclass in their constructors
	FlyBehavior flyBehavior;
	QuackBahavior quackBehavior;

	public Duck() {
	}

	public abstract void display();

	public void swim() {
		System.out.println("All duck float, even decoys");
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	// Dynamically change the fly behavior
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	// Dynamically change the quack behavior
	public void setQuackBehavior(QuackBahavior quackBahavior) {
		this.quackBehavior = quackBahavior;
	}

}
