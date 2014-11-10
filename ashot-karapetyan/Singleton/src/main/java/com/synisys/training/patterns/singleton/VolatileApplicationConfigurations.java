package com.synisys.training.patterns.singleton;

/**
 * Singleton implementation with static volatile instance.
 */
public class VolatileApplicationConfigurations {

	private static volatile VolatileApplicationConfigurations instance;

	private VolatileApplicationConfigurations() {
		initConfigurations();
	}

	public static VolatileApplicationConfigurations getInstance() {

		if (instance == null) {
			synchronized (VolatileApplicationConfigurations.class){
				if (instance == null) {
					instance = new VolatileApplicationConfigurations();
				}
			}
		}
		return instance;
	}

	private void initConfigurations() {
		//simulate code execution.
	}
}
