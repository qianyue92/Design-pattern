package facade;

public class FacadeImpl implements Facade {

    private Sub1 sub1;
    
    private Sub2 sub2;

    public FacadeImpl() {
        super();
        this.sub1 = new Subiml1();
        this.sub2 = new Subiml2();
    }

    @Override
    public void function11() {
        sub1.function1();
        sub2.function2();
    }

    @Override
    public void function22() {
        sub2.function2();
    }
}
