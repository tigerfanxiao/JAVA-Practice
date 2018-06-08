package practice.designpartten.abstractFactoryPattern;

import org.junit.Test;

public class TestAbstractFactory {
	
	@Test
	public void testAbstractFactoryPattern() {
		// we can change the whole theme by just change the instance of Theme factory
		ThemeFactory myThemeFactory = new AdvanceThemeFactory();
		System.out.println(myThemeFactory.themeName);
		myThemeFactory.changeTheme();
	}
}
