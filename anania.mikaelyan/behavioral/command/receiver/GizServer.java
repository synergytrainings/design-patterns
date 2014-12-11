package com.synisys.training.patterns.behavioral.command.receiver;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class GizServer implements Server {
    @Override
    public void connect() {
        System.out.println("Connecting to Giz server");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning  Giz server");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying  applications on Giz");
    }

    @Override
    public void start() {
        System.out.println("Start Giz Server");
    }

    @Override
    public void stop() {
        System.out.println("Stop Giz Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Giz server");
    }
}
