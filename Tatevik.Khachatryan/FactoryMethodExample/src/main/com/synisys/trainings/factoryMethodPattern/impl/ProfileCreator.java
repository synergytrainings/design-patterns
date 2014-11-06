package main.com.synisys.trainings.factoryMethodPattern.impl;

import main.com.synisys.trainings.factoryMethodPattern.Creator;
import main.com.synisys.trainings.factoryMethodPattern.DeItem;

/**
 * Concrete Creator which is responsible for implementing the “Create” method
 * and creates Profile
 * 
 * @author tatevik.khachatryan
 * 
 */
public class ProfileCreator implements Creator {
	/**
	 * Prevents object creation from outside
	 */
	private ProfileCreator() {
	}

	// factory method to instantiate the class
	public static ProfileCreator getInstance() {
		// here can be some condition checking
		return new ProfileCreator();
	}

	@Override
	public DeItem create(Integer deItemId, String name) {
		return new Profile(deItemId, name);
	}
}
