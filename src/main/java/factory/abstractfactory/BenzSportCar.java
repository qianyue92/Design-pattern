package factory.abstractfactory;

public class BenzSportCar extends BenzCar {

    @Override
    public void drive() {
        System.out.println(this.getName()+"----BenzSportCar-----------------------");
    }
}
