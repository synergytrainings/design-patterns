package com.synisys.training.patters.abstractfactory.api;


import com.synisys.training.patters.abstractfactory.implementation.RdbDAOFactory;
import com.synisys.training.patters.abstractfactory.implementation.XmlDAOFactory;

public abstract class DAOFactory {

    public abstract UserDAO getUserDAO();

    public static DAOFactory getInstance(PersistenceType persistenceType) {
        switch (persistenceType) {
            case RELATIONAL_DATA_BASE:
                return new RdbDAOFactory();
            case XML:
                return new XmlDAOFactory();
            default:
                throw new IllegalArgumentException(String.format("Unsupported persistence type %s", persistenceType));
        }
    }
}
