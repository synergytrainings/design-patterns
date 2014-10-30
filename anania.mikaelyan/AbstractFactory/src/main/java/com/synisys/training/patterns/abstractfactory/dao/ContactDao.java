package com.synisys.training.patterns.abstractfactory.dao;

import com.synisys.training.patterns.abstractfactory.domain.Contact;

/**
 * Interface that all ContactDao-s must support
 * @author Anania.Mikaelyan
 * @since 10/30/2014.
 */
public interface ContactDao extends CrudDao<Contact>{
    boolean isEmailUnique(Contact contact);
}
