package com.synisys.training.patterns.abstractfactory.factory;

import com.synisys.training.patterns.abstractfactory.dao.ContactDao;
import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;

/**
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public interface DaoFactory {
    ProjectDao getProjectDao();
    ContactDao getContactDao();
}
