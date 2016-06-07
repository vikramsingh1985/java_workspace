package org.ali.designPatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		
		System.out.println("Current Weather Condition : " + temperature + "F degree "+ humidity+ "% humidity");
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(observable  instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTempreture();
			this.humidity = weatherData.getHumidity();
			display();
			
		}

	}

}
