package com.synisys.training.patterns.abstractfactory.dao;

import com.synisys.training.patterns.abstractfactory.dao.CrudDao;
import com.synisys.training.patterns.abstractfactory.domain.Project;

/**
 * Interface that all ProjectDao-s must support
 * @author Anania.Mikaelyan
 * @since 10/30/2014.
 */
public interface ProjectDao extends CrudDao<Project> {
    int incrementDeVersion();
}
