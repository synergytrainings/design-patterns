package com.synisys.trainings.singletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton pattern example using Java Enum
 * 
 * @author tatevik.khachatryan
 * 
 */
public enum EnumLogger {
	INSTANCE;

	/**
	 * Holds logs
	 */
	private List<String> logs = new ArrayList<>();

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
