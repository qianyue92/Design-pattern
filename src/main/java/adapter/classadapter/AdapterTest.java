package adapter.classadapter;

/**
 * 测试
 */
public class AdapterTest {

    public static void main(String args[]) {
        System.out.println("===============类适配器==============");
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());
    }
}
