package decorator;

/**
 * 具体装饰者蜡烛类
 */
public class CandleDecorator extends Decorator {

    Sweet sweet;

    public CandleDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "，一根蜡烛";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
