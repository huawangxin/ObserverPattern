package cn.com.observer.dao;
/**
 * 主题
 * @author huawangxin
 * 2017年5月12日 上午12:23:25
 */
public interface Subject {
	/**
	 * 注册
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	/**
	 * 移除
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	/**
	 * 通知所有观察者
	 */
	public void notifyObserver();
	
}
