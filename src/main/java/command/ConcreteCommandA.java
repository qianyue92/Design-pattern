package command;

/**
 * Command角色A
 */
public class ConcreteCommandA implements ICommand {

    private Receiver receiver = null;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        this.receiver.DoA();
    }
}
