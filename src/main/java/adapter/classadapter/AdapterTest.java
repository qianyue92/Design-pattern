package adapter.classadapter;

/**
 * 测试
 */
public class AdapterTest {

    public static void main(String args[]) {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());
    }
}
