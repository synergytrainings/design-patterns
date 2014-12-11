package com.synisys.training.patterns.behavioral.command.receiver;

/**
 * Receiver - knows how to perform operations associated with carrying out a request. Any class may serve as Receiver.
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public interface Server {
    void connect();
    void clean();
    void deploy();
    void start();
    void stop();
    void disconnect();
}
