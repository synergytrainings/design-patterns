package com.synisys.training.patterns.abstractfactory.dao.impl.mssql;

import com.synisys.training.patterns.abstractfactory.dao.ContactDao;
import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;
import com.synisys.training.patterns.abstractfactory.domain.Contact;
import com.synisys.training.patterns.abstractfactory.domain.Project;

/**
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public class ContactDaoMsSql implements ContactDao {
    @Override
    public boolean isEmailUnique(Contact contact) {
        return false;
    }

    @Override
    public Contact loadById(Long id) {
        System.out.println("Loading via MsSql db");
        return null;
    }

    @Override
    public Long insert(Contact itemToInsert) {
        System.out.println("Inserting via MsSql db");
        return null;
    }

    @Override
    public boolean update(Contact itemToUpdate) {
        System.out.println("Updating via MsSql db");
        return false;
    }

    @Override
    public boolean delete(Contact itemToDelete) {
        System.out.println("Deleting via MsSql db");
        return false;
    }
}
