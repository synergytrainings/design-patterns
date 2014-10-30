package com.synisys.training.patterns.abstractfactory.dao.impl.mssql;

import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;
import com.synisys.training.patterns.abstractfactory.domain.Project;

/**
 * @author Anania.Mikaelyan
 * @since 10/30/2014
 */
public class ProjectDaoMsSql implements ProjectDao {
    @Override
    public int incrementDeVersion() {
        System.out.println("Incrementing De version via MsSql ");
        return 1;
    }

    @Override
    public Project loadById(Long id) {
        System.out.println("Loading via MsSql db");
        return null;
    }

    @Override
    public Long insert(Project itemToInsert) {
        System.out.println("Inserting via MsSql db");
        return null;
    }

    @Override
    public boolean update(Project itemToUpdate) {
        System.out.println("Updating via MsSql db");
        return false;
    }

    @Override
    public boolean delete(Project itemToDelete) {
        System.out.println("Deleting via MsSql db");
        return false;
    }
}
