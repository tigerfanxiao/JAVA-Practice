package practice.designpattern.decoratorPattern;

public abstract class Beverage {
	String description = "unknown beverage";
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	
	public abstract String getDescription();
	
	
	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public abstract double cost();
}
