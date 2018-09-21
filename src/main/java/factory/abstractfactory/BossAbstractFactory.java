package factory.abstractfactory;

public class BossAbstractFactory {

    public static void main(String[] args) throws Exception {

        Driver3 d = new SportDriver();
        BenzCar car = d.createBenzCar("");
        car.drive();
    }
}
