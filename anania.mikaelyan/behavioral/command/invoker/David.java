package com.synisys.training.patterns.behavioral.command.invoker;

import com.synisys.training.patterns.behavioral.command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker - Asks the command to carry out the request.
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class David {
    private List<Command> commands = new ArrayList<>(5);
    private int index = 0;


    public void run(){
        commands.get(index++).execute();
    }

    public void undo(){
        commands.get(index-1).undo();
        index--;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}
