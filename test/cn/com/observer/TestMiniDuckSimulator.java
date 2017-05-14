package cn.com.observer;

//import cn.com.observer2.CurrentConditionsDisplay;
//import cn.com.observer2.WeatherData;
import cn.com.observer2.CurrentConditionsDisplay;
import cn.com.observer2.WeatherData;

/**
 * 对应测试类
 * @author huawangxin
 * 2017年5月11日 上午12:36:30
 */
public class TestMiniDuckSimulator {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecaseDisplay forecaseDisplay = new ForecaseDisplay();
		weatherData.setMeasurements(80,65,30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
