package singleton;

/**
 * 静态内部类
 */
public class Singleton5 {
    // 私有构造
    private Singleton5() {}

    // 静态内部类
    private static class InnerObject{
        private static Singleton5 single = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return InnerObject.single;
    }

}
