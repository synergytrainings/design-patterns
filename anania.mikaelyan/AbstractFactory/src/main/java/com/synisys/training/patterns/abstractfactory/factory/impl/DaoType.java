package com.synisys.training.patterns.abstractfactory.factory.impl;

import com.synisys.training.patterns.abstractfactory.dao.ContactDao;
import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;
import com.synisys.training.patterns.abstractfactory.dao.impl.mssql.ContactDaoMsSql;
import com.synisys.training.patterns.abstractfactory.dao.impl.mssql.ProjectDaoMsSql;
import com.synisys.training.patterns.abstractfactory.dao.impl.oracle.ContactDaoOracle;
import com.synisys.training.patterns.abstractfactory.dao.impl.oracle.ProjectDaoOracle;
import com.synisys.training.patterns.abstractfactory.factory.DaoFactory;

/**
 * DAO types supported by the factory
 * Enum provide singletons implementations for factories
 *
 * @author Anania.Mikaelyan
 * @since 10/31/2014
 */
public enum DaoType implements DaoFactory {
    // MsSql concrete DAO Factory implementation
    MsSql {
        @Override
        public ProjectDao getProjectDao() {
            return new ProjectDaoMsSql();
        }

        @Override
        public ContactDao getContactDao() {
            return new ContactDaoMsSql();
        }
    },
    // Oracle concrete DAO Factory implementation
    Oracle {
        @Override
        public ProjectDao getProjectDao() {
            return new ProjectDaoOracle();
        }

        @Override
        public ContactDao getContactDao() {
            return new ContactDaoOracle();
        }
    }
}
