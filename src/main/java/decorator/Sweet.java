package decorator;

/**
 * 装饰者和被装饰者的超类
 */
public abstract class Sweet {

    String description = "Sweet";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
