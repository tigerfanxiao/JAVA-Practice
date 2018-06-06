package practice.designpartten.abstractFactoryPattern;

public class DefaultThemFactory extends ThemeFactory {
	
	public DefaultThemFactory() {
		themeName = "Default Theme";
	}
	
	@Override
	public ThemeColor getThemeColorInstance() {
		return new DefaultThemeColorRed();
	}

	@Override
	public ThemeStyle getThemeStyleInstance() {
		return new DefaultThemeStylePlain();
	}

	@Override
	public ThemeMotion getThemeMotionInstance() {
		return new DefaultThemeMotionStatic();
	}

}
