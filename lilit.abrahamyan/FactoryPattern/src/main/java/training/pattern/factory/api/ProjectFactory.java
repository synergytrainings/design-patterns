package main.java.training.pattern.factory.api;

import main.java.training.pattern.factory.impl.FinancialProject;
import main.java.training.pattern.factory.impl.TrainingProject;

/**
 * Project factory , creates {@link Project} instances according to {@link ProjectType} 
 * @author LilitsComp
 *
 */
public class ProjectFactory {
	public static Project buildProject(ProjectType projectType) {
		Project project = null;
        switch (projectType) {
        case FINANCIAL:
            project = new FinancialProject();
            break;
 
        case TRAINING:
            project = new TrainingProject();
            break;
  
        default:
            break;
        }
        return project;
    }
}
