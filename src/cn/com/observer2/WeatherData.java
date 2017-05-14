package cn.com.observer2;

import java.util.ArrayList;
import java.util.Observable;

import cn.com.observer.dao.Observer;
import cn.com.observer.dao.Subject;

/**
 * 
 * @author huawangxin
 * 2017年5月12日 上午12:04:11
 */
public class WeatherData extends Observable{

	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {}

	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
