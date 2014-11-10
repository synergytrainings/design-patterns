package com.synisys.training.patterns.singleton.abstractfactory.implementation;

import com.synisys.training.patterns.singleton.abstractfactory.api.User;
import com.synisys.training.patterns.singleton.abstractfactory.api.UserDAO;

import java.util.List;


public class XmlUserDAO implements UserDAO {
    @Override
    public List<User> loadUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public User loadUser(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int deleteUser(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int UpdateUser(User user) {
        throw new UnsupportedOperationException();
    }
}
