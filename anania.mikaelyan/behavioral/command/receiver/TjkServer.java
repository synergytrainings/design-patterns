package com.synisys.training.patterns.behavioral.command.receiver;

/**
 * @author Anania.Mikaelyan
 * @since 12/12/2014
 */
public class TjkServer implements Server {
    @Override
    public void connect() {
        System.out.println("Connecting to Tjk server");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning  Tjk server");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying  applications on Tjk");
    }

    @Override
    public void start() {
        System.out.println("Start Tjk Server");
    }

    @Override
    public void stop() {
        System.out.println("Stop Tjk Server");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Tjk server");
    }
}
