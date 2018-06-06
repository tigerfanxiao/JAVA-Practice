package practice.designpartten.singltonPattern;

import org.junit.Test;

public class TestSingleton {
	@Test
	public void testSingleton() {
		// initiate the first instance
		ChocolateBoiler chocolateBoiler01 = ChocolateBoiler.getInstance();
		// change the status of chocolate boiler by fill method
		chocolateBoiler01.fill();
		// intend to get the second instance of Chocolate boiler
		ChocolateBoiler chocolateBoiler02 = ChocolateBoiler.getInstance();
		// find the instance status is the same as first instance
		// so there is only one instance
		System.out.println(chocolateBoiler02.isEmpty());
		System.out.println(chocolateBoiler02.isBoiled());
	}
}
