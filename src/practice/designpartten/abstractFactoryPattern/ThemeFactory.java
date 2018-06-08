package practice.designpartten.abstractFactoryPattern;


public abstract class ThemeFactory {
	String themeName = "Abstract Theme";
	
	public void changeTheme() {
		getThemeColorInstance().setThemeColor();
		getThemeStyleInstance().setThemeStyle();;
		getThemeMotionInstance().setThemeMotion();;
	}
	
	public abstract ThemeColor getThemeColorInstance();
	
	public abstract ThemeStyle getThemeStyleInstance();
	
	public abstract ThemeMotion getThemeMotionInstance();
	
}
