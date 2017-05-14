package cn.com.observer2;

import java.util.Observable;
import java.util.Observer;

import cn.com.observer.dao.DisplayElement;
import cn.com.observer.dao.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs,Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display(){
		System.out.println("current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
	}

}
