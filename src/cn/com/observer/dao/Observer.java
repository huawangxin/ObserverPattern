package cn.com.observer.dao;
/**
 * 观察者
 * @author huawangxin
 * 2017年5月12日 上午12:23:33
 */
public interface Observer {
	public void update(float temp,float humidity,float pressure);

	//public Observer get(int i);
}
