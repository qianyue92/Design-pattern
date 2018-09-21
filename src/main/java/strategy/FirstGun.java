package strategy;

/**
 * 具体策略类
 */
public class FirstGun implements Weapon {

    @Override
    public void gun() {
        System.out.println("使用AWM狙击枪");
    }
}
