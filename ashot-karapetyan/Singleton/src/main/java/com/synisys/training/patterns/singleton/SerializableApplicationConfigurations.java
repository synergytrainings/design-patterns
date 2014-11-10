package com.synisys.training.patterns.singleton;

import java.io.Serializable;

/**
 * Serializable singleton class.
 * Add implementation of {@link #readResolve()} method to guarantee single instance after de-serialization.
 */
public class SerializableApplicationConfigurations implements Serializable{

	private static final long serialVersionUID = 469285481457666955L;

	private SerializableApplicationConfigurations(){
		initConfigurations();
	}


	private static class SingletonHolder {
		private static final SerializableApplicationConfigurations INSTANCE = new SerializableApplicationConfigurations();
	}

	public static SerializableApplicationConfigurations getInstance() {
		return SingletonHolder.INSTANCE;
	}


	/**
	 * Implements to return same object after de-serialization.
	 */
	protected Object readResolve() {
		return SingletonHolder.INSTANCE;
	}

	private void initConfigurations() {
		//init configs
	}
}
