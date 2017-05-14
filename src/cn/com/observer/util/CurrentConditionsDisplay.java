package cn.com.observer.util;

import cn.com.observer.dao.DisplayElement;
import cn.com.observer.dao.Observer;
import cn.com.observer.dao.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display(){
		System.out.println("current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
	}

}
