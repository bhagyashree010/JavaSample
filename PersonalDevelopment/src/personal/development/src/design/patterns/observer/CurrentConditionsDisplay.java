package personal.development.src.design.patterns.observer;

public class CurrentConditionsDisplay implements Observer , DisplayElements
{

	double temperature;
	double humidity;
	double pressure;
	
	private WeatherSubject subject ;
	
	public CurrentConditionsDisplay(WeatherSubject sub) {
		subject = sub;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		displayElements();
	}

	@Override
	public void displayElements() {
		System.out.println("Current weather conditions stats: ");
		System.out.println("Temperature : "+temperature);
		System.out.println("Pressure : "+pressure);
		System.out.println("humidity : "+humidity);
		System.out.println("================================");
		
	}

}
