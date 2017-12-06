package personal.development.src.design.patterns.observer;

public interface WeatherSubject 
{
	void registerObserver(Observer observer);
	void unregisterObserver(Observer observer);
	void notifyObservers();
}
