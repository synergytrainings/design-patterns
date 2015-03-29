package com.armen.mkrtchyan.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class UserMediator {

    private final Map<String, UserGroup> userGroups = new HashMap<>();

    public void registerGroup(String name, User creator) {
        UserGroup userGroup;
        userGroups.put(name, userGroup = new UserGroup(name, this));
        userGroup.addUser(creator);
    }

    public void sendMessage(String message, String group, User sender) {
        userGroups.get(group).sendMessage(message, sender);
    }

    public void addUser(String group, User user) {
        userGroups.get(group).addUser(user);
    }



}
