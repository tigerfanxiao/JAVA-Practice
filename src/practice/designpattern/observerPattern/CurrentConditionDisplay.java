package practice.designpattern.observerPattern;

public class CurrentConditionDisplay implements MyObserver, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Publisher weatherData;
	
	public CurrentConditionDisplay(Publisher weacherData) {
		this.weatherData = weacherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
