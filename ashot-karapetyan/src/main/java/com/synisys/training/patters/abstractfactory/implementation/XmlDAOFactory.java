package com.synisys.training.patters.abstractfactory.implementation;


import com.synisys.training.patters.abstractfactory.api.DAOFactory;
import com.synisys.training.patters.abstractfactory.api.UserDAO;

public class XmlDAOFactory extends DAOFactory {

    @Override
    public UserDAO getUserDAO() {
        return new XmlUserDAO();
    }
}
