package practice.designpartten.singltonPattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		} 
		System.out.println("Return instance of Chocolate Boiler");
		return uniqueInstance;
			 
	}
	// file the chocolate boiler
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}	
	}
	
	//  drain the chocolate boiler
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			boiled = false;
		}
	}
	// boil the chocolate boiler
	public void boil() {
		if (!isBoiled() && !isEmpty()) {
			boiled = true;
		}
	}
	
	public boolean isBoiled() {
		return boiled;
	}

	// check if the chocolate boiler is empty or not
	public boolean isEmpty() {
		return empty;
	}
}
