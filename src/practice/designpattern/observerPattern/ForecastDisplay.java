package practice.designpattern.observerPattern;

public class ForecastDisplay implements MyObserver, DisplayElement {
	
	private float currentPressure;
	private float lastPressure;
	private Publisher weatherData; 
	
	public ForecastDisplay(Publisher weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}	
	}


	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.lastPressure = this.currentPressure;
		this.currentPressure = pressure;
		display();
		
	}

}
