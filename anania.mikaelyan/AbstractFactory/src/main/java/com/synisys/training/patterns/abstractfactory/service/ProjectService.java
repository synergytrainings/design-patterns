package com.synisys.training.patterns.abstractfactory.service;

import com.synisys.training.patterns.abstractfactory.dao.ProjectDao;
import com.synisys.training.patterns.abstractfactory.domain.Project;
import com.synisys.training.patterns.abstractfactory.factory.impl.DaoType;

/**
 * @author Anania.Mikaelyan
 * @since 10/31/2014
 */
public class ProjectService {
    public boolean saveProject(Project project, DaoType daoType){
        ProjectDao projectDao = daoType.getProjectDao();
        if(project.isNew()){
            Long newId = projectDao.insert(project);
            project.setId(newId);
            project.setOld();
        }else{
            projectDao.update(project);
        }
        return projectDao.incrementDeVersion() > 0;
    }

    //..other methods are skipped

    //..contactService are skipped too
}
