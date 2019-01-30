package template;

public class Client {
    public static void main(String[] args) {
        //家里的第一辆车，作为用户的我们并不需要关注车怎么启动的.子类变量变为父类。多态
        CarModel wcar = new DasCar();
        wcar.excet();

        //突然家里需要第二辆车了-奥迪,我们也不需要关注他怎么生产启动的
        CarModel ocar = new AudiCar();
        ocar.excet();
    }
}
