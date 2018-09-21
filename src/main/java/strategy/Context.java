package strategy;

/**
 * 环境类
 */
public class Context {

    public Weapon weapon;

    public Context(Weapon weapon) {
        super();
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void gun() {
        weapon.gun();
    }
}
