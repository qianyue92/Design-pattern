package template;

/**
 * 奥迪车
 */
public class AudiCar extends CarModel{

    @Override
    protected void start() {
        System.out.println("奥迪无匙启动");
    }

    @Override
    protected void stop() {
        System.out.println("奥迪停车");
    }

}
