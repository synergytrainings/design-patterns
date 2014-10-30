package com.synisys.training.patterns.abstractfactory.dao.impl.oracle;

import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;
import com.synisys.training.patterns.abstractfactory.domain.Project;

/**
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public class ProjectDaoOracle implements ProjectDao{
    @Override
    public int incrementDeVersion() {
        System.out.println("Incrementing De version via Oracle ");
        return 1;
    }

    @Override
    public Project loadById(Long id) {
        System.out.println("Loading via Oracle db");
        return null;
    }

    @Override
    public Long insert(Project itemToInsert) {
        System.out.println("Inserting via Oracle db");
        return null;
    }

    @Override
    public boolean update(Project itemToUpdate) {
        System.out.println("Updating via Oracle db");
        return false;
    }

    @Override
    public boolean delete(Project itemToDelete) {
        System.out.println("Deleting via Oracle db");
        return false;
    }
}
