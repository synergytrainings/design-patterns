package com.armen.mkrtchyan.mediator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class UserGroup {

    private final String name;
    private final UserMediator userMediator;
    private final Collection<User> users = new ArrayList<>();

    public UserGroup(String name, UserMediator userMediator) {
        this.name = name;
        this.userMediator = userMediator;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {
        users.stream().forEach(user -> {if (!user.equals(sender)) user.receive(message);});
    }
}
