package personal.development.src.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherSubject
{
	double temperature;
	double humidity;
	double pressure;
	
	private List<Observer> observers;
	
	public WeatherData() 
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	void setMeasurements(double temp, double hum, double press)
	{
		temperature = temp;
		humidity = hum;
		pressure = press;
		measurementsChanged();
	}
	
	private void measurementsChanged()
	{
		notifyObservers();
	}

}
