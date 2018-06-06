package practice.designpattern.decoratorPattern;

public class Beer extends Beverage {

	public Beer() {
		description = "Beer";
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 20.00;
	}

}
