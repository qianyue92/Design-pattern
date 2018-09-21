package singleton;

/**
 * 饿汉式（立即加载方式）
 */
public class Singleton1 {

    // 私有构造
    private Singleton1() {}

    private static Singleton1 single = new Singleton1();

    // 静态工厂方法
    public static Singleton1 getInstance() {
        return single;
    }

}
