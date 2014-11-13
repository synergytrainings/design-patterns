package com.synisys.training.patterns.abstractfactory.dao;

/**
 * Parent interface for all crud(Create, Read, Update, Delete) type DAO-s
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public interface CrudDao<T> {
    T loadById(Long id);
    Long insert(T itemToInsert);
    boolean update(T itemToUpdate);
    boolean delete(T itemToDelete);
}
