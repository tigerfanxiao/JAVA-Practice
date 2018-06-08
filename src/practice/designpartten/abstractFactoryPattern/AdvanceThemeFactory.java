package practice.designpartten.abstractFactoryPattern;

public class AdvanceThemeFactory extends ThemeFactory {
	public AdvanceThemeFactory() {
		themeName = "Advance Theme";
	}
	@Override
	public ThemeColor getThemeColorInstance() {
		return new AdvanceThemeColorBlack();
	}

	@Override
	public ThemeStyle getThemeStyleInstance() {
		return new AdvanceThemeStyleTransparent();
	}

	@Override
	public ThemeMotion getThemeMotionInstance() {
		return new AdvanceThemeMotionDynamic();
	}

}
