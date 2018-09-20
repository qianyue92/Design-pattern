package decorator;

/**
 * 被装饰者蛋糕类
 */
public class Cake extends Sweet {

    @Override
    public String getDescription() {
        return "一个蛋糕";
    }

    @Override
    public double cost() {
        return 66;
    }
}
