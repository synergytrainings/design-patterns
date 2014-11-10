package com.synisys.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	// defining serialVersionUID also speeds up serialization/deserialization process
	private static final long serialVersionUID = -7604766932017737115L;

	private Singleton() {
	}

	private static class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}

	/**
	 * In case when we need store it's state in file system and retrieve it at
	 * later point of time: 
	 * 	1. We need to implement Serializable interface 
	 * 	2. We need to do it provide the implementation of readResolve() method.
	 * */

	private Object readResolve() {
		return getInstance();
	}
}
