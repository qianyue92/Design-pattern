package command;

/**
 * Invoker角色
 */
public class Invoker {

    private ICommand command;

    // 设置命令
    public void setCommand(ICommand command) {
        this.command = command;
    }
    // 执行命令
    public void runCommand() {
        command.execute();
    }
}
