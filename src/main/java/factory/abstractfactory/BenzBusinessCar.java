package factory.abstractfactory;

public class BenzBusinessCar extends BenzCar {

    @Override
    public void drive(){
        System.out.println(this.getName()+"----BenzBusinessCar-----------------------");
    }
}
