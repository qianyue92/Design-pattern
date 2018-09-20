package factory.factorymethod;

public class Boss {

    public static void main(String[] args) throws Exception {
        Driver d = new BenzDriver();
        Car c = d.createCar("Benz");
        c.setName("Benz");
        c.drive();
    }
}
