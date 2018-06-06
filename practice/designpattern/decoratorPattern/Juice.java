package practice.designpattern.decoratorPattern;

public class Juice extends Beverage {
	
	public Juice() {
		description = "Juice";
	}
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 30.00;
	}

}
