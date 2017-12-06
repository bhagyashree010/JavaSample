package personal.development.src.design.patterns.observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay observer = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(40.9, 109.6, 76.6);
		weatherData.setMeasurements(20.9, 179.2, 56.3);
		weatherData.setMeasurements(32.2, 99, 23);
		weatherData.setMeasurements(47.8, 298.5, 89.3);
	}
}
