package com.synisys.training.patterns.singleton.abstractfactory.implementation;

import com.synisys.training.patterns.singleton.abstractfactory.DAOFactory;
import com.synisys.training.patterns.singleton.abstractfactory.api.UserDAO;


public class RdbDAOFactory extends DAOFactory {

    @Override
    public UserDAO getUserDAO() {
        return new RdbUserDAO();
    }
}
