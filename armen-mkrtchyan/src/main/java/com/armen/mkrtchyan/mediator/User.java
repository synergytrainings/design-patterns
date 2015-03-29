package com.armen.mkrtchyan.mediator;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class User {

    private final String name;
    private final UserMediator userMediator;

    public User(String name, UserMediator userMediator) {
        this.name = name;
        this.userMediator = userMediator;
    }


    public void receive(String message) {
        System.out.printf("User %s received message -> %s \n", name, message);
    }

    public void createGroup(String name) {
        System.out.printf("User %s created group -> %s \n", this.name, name);
        userMediator.registerGroup(name, this);
    }

    public void addUserToGroup(User user, String group) {
        userMediator.addUser(group, user);
    }

    public void sendMessageToGroup(String message, String group) {
        userMediator.sendMessage(message, group, this);
    }
}
