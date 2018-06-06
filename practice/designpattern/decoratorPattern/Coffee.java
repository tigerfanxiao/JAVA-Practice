package practice.designpattern.decoratorPattern;

public class Coffee extends Beverage {
	
	public Coffee() {
		description = "Coffee";
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 10.00;
	}

}
