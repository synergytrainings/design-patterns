package com.synisys.trainings.singletonPattern;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Example of Singleton pattern implementation via Lazy loading within inner
 * class. Here Logger is also Serializable.
 * 
 * @author tatevik.khachatryan
 * 
 */
public class LazyLoadingLogger2 implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Holds logs
	 */
	private List<String> logs = new ArrayList<>();

	/**
	 * Wrapped in a inner static class so that loaded only when required
	 */
	private static class Loader {
		private static final LazyLoadingLogger2 INSTANCE = new LazyLoadingLogger2();
	}

	/**
	 * Empty constructor to prevent creating another instance of Singleton
	 */
	private LazyLoadingLogger2() {
	}

	public static LazyLoadingLogger2 getInstance() {
		return Loader.INSTANCE;
	}

	// No more fear of serialization: during deserialization no new object will
	// be created
	@SuppressWarnings("unused")
	private LazyLoadingLogger2 readResolve() {
		return Loader.INSTANCE;
	}

	/**
	 * Override clone not to create new object
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/**
	 * Add new log to the logs list
	 * 
	 * @param log
	 */
	public void addLog(String log) {
		logs.add(log);
	}

	/**
	 * @return last registered log
	 */
	public String getLastLog() {
		return logs.get(logs.size() - 1);
	}
}
