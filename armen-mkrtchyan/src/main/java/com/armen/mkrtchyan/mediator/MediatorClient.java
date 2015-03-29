package com.armen.mkrtchyan.mediator;

import java.util.Arrays;
import java.util.List;

/**
 * @author 'armen.mkrtchyan'
 * @version 1.0
 */
public class MediatorClient {

    public static void main(String[] args) {
        List<User> users = setUpUsers(new UserMediator());
        users.get(0).createGroup("blah group");
        users.get(0).addUserToGroup(users.get(1), "blah group");
        users.get(0).addUserToGroup(users.get(2), "blah group");
        users.get(0).sendMessageToGroup("Hi everyone", "blah group");
    }


    public static List<User> setUpUsers(UserMediator userMediator) {
        return Arrays.asList(
                new User("blah user 1", userMediator),
                new User("blah user 2", userMediator),
                new User("blah user 3", userMediator)
        );
    }
}
