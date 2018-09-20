package factory.factorymethod;

/**
 * 具体工厂（每个具体工厂负责一个具体产品）
 */
public class BenzDriver extends Driver {

    @Override
    public Car createCar(String car) throws Exception {
        return new Benz();
    }
}
