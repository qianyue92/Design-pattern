package command;

/**
 * 客户端调用
 */
public class Client {

    public Client() {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommandA(receiver));
        invoker.runCommand();
        invoker.setCommand(new ConcreteCommandB(receiver));
        invoker.runCommand();
    }
}
