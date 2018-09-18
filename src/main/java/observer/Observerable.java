package observer;


/**
 * 被观察者接口
 */
public interface Observerable {

    // 添加观察者
    void registerObserver(Observer o);

    // 删除观察者
    void removeObserver(Observer o);

    // 通知观察者
    void notifyObserver();

}
