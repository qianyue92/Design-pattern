package adapter.classadapter;

/**
 * Client类：手机，需要5V电压
 */
public class Mobile {

    // 充电方法
    public void charging(Voltage5 voltage5) {
        if (voltage5.output5V() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5V() > 5) {
            System.out.println("警告！电压超过5V");
        }
    }
}
