package factory.simplefactory;

/**
 * Benz具体类
 */
public class Benz extends Car {

    @Override
    public void drive() {
        System.out.println(this.getName() + "出发！");
    }
}
