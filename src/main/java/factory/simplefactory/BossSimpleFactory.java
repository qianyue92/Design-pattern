package factory.simplefactory;

public class BossSimpleFactory {

    public static void main(String[] args) {
        //老板告诉司机我今天坐奔驰
        Car car = Driver.createCar("Benz");
        car.setName("Benz");
        //司机开着奔驰出发
        car.drive();
    }
}
