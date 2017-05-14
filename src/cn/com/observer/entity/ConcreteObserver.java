package cn.com.observer.entity;

import cn.com.observer.dao.Observer;

public class ConcreteObserver implements Observer{

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("【ConcreteObserver】"+"观察者");
	}

	//其他方法
}
