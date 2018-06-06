package practice.designpartten.singltonPattern;

import org.junit.Test;

public class TestSingleton {
	@Test
	public void testSingleton() {
		ChocolateBoiler chocolateBoiler01 = ChocolateBoiler.getInstance();
		chocolateBoiler01.fill();
		ChocolateBoiler chocolateBoiler02 = ChocolateBoiler.getInstance();
		System.out.println(chocolateBoiler02.isEmpty());
		System.out.println(chocolateBoiler02.isBoiled());
	}
}
