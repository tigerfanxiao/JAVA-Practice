package practice.designpattern.decoratorPattern;

import org.junit.Test;

import practice.designpattern.decoratorPattern.Beverage.Size;

public class TestDecoratorPattern {
	
	@Test
	public void TestDecorationDesignPattern() {
		Beverage beer = new Coffee();
		beer.setSize(Size.GRANDE);
		// Grand cup times 1.5
		beer = new CupSize(beer);
		// Iced add 1
		beer = new Iced(beer);
		
		System.out.println(beer.getDescription());
		System.out.println(beer.cost());
	}
}
