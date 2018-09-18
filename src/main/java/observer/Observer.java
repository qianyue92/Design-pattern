package observer;

/**
 * 观察者接口
 */
public interface Observer {

    // 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
    void update(String message);
}
