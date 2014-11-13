package com.synisys.training.patterns.abstractfactory;

import com.synisys.training.patterns.abstractfactory.domain.Project;
import com.synisys.training.patterns.abstractfactory.factory.impl.DaoType;
import com.synisys.training.patterns.abstractfactory.service.ProjectService;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 10/31/2014
 */
public class AbstractFactoryTest {


    @Test
    public void testProject() {
        ProjectService projectService = new ProjectService();
        projectService.saveProject(new Project(true, (long) -1), DaoType.MsSql);
        projectService.saveProject(new Project(false, (long) 1), DaoType.Oracle);
    }

    @Test
    public void testContact() {
        //implementation skipped :)


        //ContactService projectService = new ContactService();
        //projectService.saveContact(new Contact(true, (long) -1), DaoType.MsSql);
        //projectService.saveContact(new Contact(false, (long) 1), DaoType.Oracle);
    }
}
