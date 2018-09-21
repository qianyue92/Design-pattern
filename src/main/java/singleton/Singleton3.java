package singleton;

/**
 * 懒汉式加同步锁
 */
public class Singleton3 {
    // 私有构造
    private Singleton3() {}

    private static Singleton3 single = null;

    public static Singleton3 getInstance() {

        // 等同于 synchronized public static Singleton3 getInstance()
        synchronized(Singleton3.class) {
            // 注意：里面的判断是一定要加的，否则出现线程安全问题
            if(single == null){
                single = new Singleton3();
            }
        }
        return single;
    }

}
