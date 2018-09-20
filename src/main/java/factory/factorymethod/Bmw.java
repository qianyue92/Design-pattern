package factory.factorymethod;

/**
 * BMW具体类
 */
public class Bmw extends Car {

    @Override
    public void drive() {
        System.out.println(this.getName() + "出发！");
    }
}
