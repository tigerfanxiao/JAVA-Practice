package practice.designpattern.observerPattern;

import org.junit.Test;

public class TestObserverDesignPattern {
	
	@Test
	public void testObserverPattern() {
		
		WeatherData weatherData = new WeatherData();
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		// we could notify observers each time we change the status of weather
		weatherData.setMeasurements(80f, 65f, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
