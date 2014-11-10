package com.synisys.training.patterns.singleton.abstractfactory.api;

import java.util.List;

public interface UserDAO {

    List<User> loadUsers();

    User loadUser(int id);

    int deleteUser(int id);

    int UpdateUser(User user);
}
