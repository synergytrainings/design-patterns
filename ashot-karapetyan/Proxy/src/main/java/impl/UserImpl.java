package impl;

import api.User;
import api.UserType;


public class UserImpl implements User {

    private String name;

    private UserType type;

    public UserImpl(String name, UserType type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getUserName() {
        return this.name;
    }

    @Override
    public UserType getType() {
        return this.type;
    }
}
