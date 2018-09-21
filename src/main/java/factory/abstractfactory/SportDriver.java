package factory.abstractfactory;

/**
 * 具体工厂
 */
public class SportDriver extends Driver3 {
    public BenzCar createBenzCar(String car) throws Exception {
        return new BenzSportCar();
    }
}
