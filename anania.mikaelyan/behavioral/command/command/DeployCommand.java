package com.synisys.training.patterns.behavioral.command.command;

import com.synisys.training.patterns.behavioral.command.receiver.Server;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class DeployCommand implements Command {
    private final Server server;

    public DeployCommand(Server server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.connect();
        server.clean();
        server.deploy();
        server.start();
        server.disconnect();
    }

    @Override
    public void undo() {
        server.connect();
        server.clean();
        server.disconnect();
    }
}
