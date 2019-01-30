package template;

/**
 * 大众车
 */
public class DasCar extends CarModel{

    @Override
    protected void start() {
        System.out.println("大众车启动");
    }

    @Override
    protected void stop() {
        System.out.println("大众车停车");
    }
}