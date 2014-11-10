package com.synisys.training.patterns.singleton;

/**
 * Singleton implementation with static inner class.
 * <br/>
 * This realization guarantees thread-safe, lazy initialization for single instance.
 */
public class ApplicationConfigurations {

	private ApplicationConfigurations() {
		initConfigurations();

		//Avoid initialization by reflection.
		if(SingletonHolder.INSTANCE != null){
			throw new  UnsupportedOperationException("Unacceptable initialization! Use getInstance() method.");
		}
	}


	private static class SingletonHolder {
		private static final ApplicationConfigurations INSTANCE = new ApplicationConfigurations();
	}

	public static ApplicationConfigurations getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private void initConfigurations() {
		//to something
	}

}
