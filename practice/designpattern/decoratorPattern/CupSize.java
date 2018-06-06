package practice.designpattern.decoratorPattern;

public class CupSize extends Beverage{
	private Beverage beverage;
	public CupSize(Beverage beverage) {
		this.beverage = beverage;
		description = beverage.getSize().toString() + " " + beverage.getDescription();
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public double cost() {
		double cost = beverage.cost();;
		if(beverage.getSize() == Size.TALL) {
			cost *= 1;
		} else if(beverage.getSize() == Size.GRANDE) {
			cost *= 1.5;
		} else if(beverage.getSize() == Size.VENTI) {
			cost *= 2;
		}
		return cost;
	}

}
