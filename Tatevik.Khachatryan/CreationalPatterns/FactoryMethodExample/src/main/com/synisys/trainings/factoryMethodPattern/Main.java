package main.com.synisys.trainings.factoryMethodPattern;

import main.com.synisys.trainings.factoryMethodPattern.impl.*;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * In this example the client doesn't have a direct reference to the classes that are creating the object, 
		 * but instead has reference to the abstract Creator
		 */
		Creator projectCreator = ProjectCreator.getInstance();
		
		// create project object
		DeItem project = projectCreator.create(1, "Project 1");
		
		System.out.println(project.toString());
		
		// create profile 
		DeItem profile = ProfileCreator.getInstance().create(1, "Profile");
		((Profile) profile).setProfileTitle("Profile title");
		
		System.out.println(profile.toString());
	}
}
