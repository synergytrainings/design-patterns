package com.synisys.training.patters.abstractfactory;

import com.synisys.training.patters.abstractfactory.api.DAOFactory;
import com.synisys.training.patters.abstractfactory.api.PersistenceType;
import com.synisys.training.patters.abstractfactory.implementation.RdbUserDAO;
import com.synisys.training.patters.abstractfactory.implementation.XmlUserDAO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDAOFactory {

    @Test
    public void testRdbDAOFactory() {
        DAOFactory daoFactory = DAOFactory.getInstance(PersistenceType.RELATIONAL_DATA_BASE);
        assertEquals("UserDAO must be RdbUserDAO!", RdbUserDAO.class, daoFactory.getUserDAO().getClass());
    }

    @Test
    public void testXmlDAOFactory() {
        DAOFactory daoFactory = DAOFactory.getInstance(PersistenceType.XML);
        assertEquals("UserDAO must be XmlUserDAO!", XmlUserDAO.class, daoFactory.getUserDAO().getClass());
    }

}
