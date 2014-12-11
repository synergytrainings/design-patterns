package com.synisys.training.patterns.behavioral.command.command;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public interface Command {
    void execute();
    void undo();
}
