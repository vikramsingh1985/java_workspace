package org.ali.designPatterns.observer;

public class TestObserverPattern {

	public static void main ( String[] strings ){
		
		WeatherData weatherData = new WeatherData();
		@SuppressWarnings("unused")
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4F);
	}
}
