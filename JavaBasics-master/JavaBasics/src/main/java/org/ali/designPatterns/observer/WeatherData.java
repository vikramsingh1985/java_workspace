package org.ali.designPatterns.observer;

import java.util.Observable;

import lombok.Getter;

@Getter 
public class WeatherData extends Observable {
	
	private float tempreture;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.tempreture = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
