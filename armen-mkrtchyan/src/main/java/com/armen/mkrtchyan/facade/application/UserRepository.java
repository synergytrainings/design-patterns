package com.armen.mkrtchyan.facade.application;

import java.util.Collection;
import java.util.Map;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 27, 2014</pre>
 */
public class UserRepository {

    private final Map<Integer, User> data;

    public UserRepository(Map<Integer, User> data) {
        this.data = data;
    }

    public Collection<User> loadAll() {
        return data.values();
    }

    public User loadUser(int id) {
        return data.get(id);
    }

    public void insertUser(User user) {
        data.put(user.getId(), user);
    }

    public void removeUser(User user) {
        data.remove(user.getId());
    }

}
