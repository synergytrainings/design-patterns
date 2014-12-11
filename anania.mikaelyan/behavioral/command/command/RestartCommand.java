package com.synisys.training.patterns.behavioral.command.command;

import com.synisys.training.patterns.behavioral.command.receiver.Server;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class RestartCommand implements Command {
    private final Server server;

    public RestartCommand(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.connect();
        server.stop();
        server.start();
        server.disconnect();
    }

    @Override
    public void undo() {
        System.out.println("Can't undo restart");
    }
}
