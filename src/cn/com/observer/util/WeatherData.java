package cn.com.observer.util;

import java.util.ArrayList;

import cn.com.observer.dao.Observer;
import cn.com.observer.dao.Subject;

/**
 * 
 * @author huawangxin
 * 2017年5月12日 上午12:04:11
 */
public class WeatherData implements Subject{

	private ArrayList observers;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}	

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	@Override
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}


}
