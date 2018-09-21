package command;

/**
 * Command角色B
 */
public class ConcreteCommandB implements ICommand {

    private Receiver receiver = null;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.DoB();
    }
}
