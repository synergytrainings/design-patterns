package com.synisys.trainings.singletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of Singleton pattern implementation via Early loading and with static
 * factory method
 * 
 * @author tatevik.khachatryan
 * 
 */
public class EarlyLoadingLogger {
	/**
	 * Holds logs
	 */
	private List<String> logs = new ArrayList<>();

	// initialized during class loading
	private static final EarlyLoadingLogger INSTANCE = new EarlyLoadingLogger();

	// Empty constructor to prevent creating another instance of Singleton
	private EarlyLoadingLogger() {
		if (INSTANCE != null) {
			throw new IllegalStateException("Already instantiated");
		}
	}

	// Returns the only one instance of Logger class
	public static EarlyLoadingLogger getInstance() {
		return INSTANCE;
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
