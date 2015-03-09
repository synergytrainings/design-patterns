package invoker;

import command.Command;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Karen on 3/10/2015.
 */
public class HumanInvoker {
    private List<Command> history = new LinkedList<>();

    public void addToQueueAndExecute(Command cmd) {
        history.add(cmd);
        cmd.execute();
    }

}
