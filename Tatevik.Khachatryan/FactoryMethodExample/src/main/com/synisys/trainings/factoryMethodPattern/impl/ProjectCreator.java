package main.com.synisys.trainings.factoryMethodPattern.impl;

import main.com.synisys.trainings.factoryMethodPattern.Creator;
import main.com.synisys.trainings.factoryMethodPattern.DeItem;

/**
 * Concrete Creator which is responsible for implementing the “Create” method
 * and creates Project
 * 
 * @author tatevik.khachatryan
 * 
 */
public class ProjectCreator implements Creator {
	/**
	 * Prevents object creation from outside
	 */
	private ProjectCreator() {
	}

	// factory method to instantiate the class
	public static ProjectCreator getInstance() {
		// here can be some condition checking
		return new ProjectCreator();
	}

	@Override
	public DeItem create(Integer deItemId, String name) {		
		return new Project(deItemId, name);
	}
}
