package practice.designpattern.observerPattern;

import java.util.ArrayList;

public class WeatherData implements Publisher {

	private ArrayList<MyObserver> observers;

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<MyObserver>();
	}

	@Override
	public void registerObserver(MyObserver observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(MyObserver observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);

	}

	@Override
	public void notifyObservers() {
		for (MyObserver observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	// we can decide how much change we will notify the observers
	public void measurementChange() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChange();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
