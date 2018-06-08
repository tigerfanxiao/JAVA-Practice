package practice.designpattern.decoratorPattern;

public class Iced extends Beverage{
	private Beverage beverage; 
	public Iced(Beverage beverage) {
		this.beverage = beverage;
		description = "Icied";
	}
	@Override
	public String getDescription() {
		return description + " " + beverage.getDescription();
	}

	@Override
	public double cost() {
		return 1 + beverage.cost();
	}
	
}
