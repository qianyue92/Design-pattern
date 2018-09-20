package decorator;

/**
 * 具体装饰者水果类
 */
public class FruitDecorator extends Decorator {

    Sweet sweet;

    public FruitDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "，一个水果";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
