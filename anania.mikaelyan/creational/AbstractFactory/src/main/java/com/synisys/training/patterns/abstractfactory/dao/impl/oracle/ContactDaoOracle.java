package com.synisys.training.patterns.abstractfactory.dao.impl.oracle;

import com.synisys.training.patterns.abstractfactory.dao.ContactDao;
import com.synisys.training.patterns.abstractfactory.domain.Contact;

/**
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public class ContactDaoOracle implements ContactDao {
    @Override
    public boolean isEmailUnique(Contact contact) {
        return false;
    }

    @Override
    public Contact loadById(Long id) {
        System.out.println("Loading via Oracle db");
        return null;
    }

    @Override
    public Long insert(Contact itemToInsert) {
        System.out.println("Inserting via Oracle db");
        return null;
    }

    @Override
    public boolean update(Contact itemToUpdate) {
        System.out.println("Updating via Oracle db");
        return false;
    }

    @Override
    public boolean delete(Contact itemToDelete) {
        System.out.println("Deleting via Oracle db");
        return false;
    }
}
