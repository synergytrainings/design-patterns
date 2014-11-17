package com.synisys.designpatterns.bridge.logger;

public class ConsoleLogger
		implements Logger {

	@Override
	public void logInfo(String log) {
		System.out.println("[INFO]: " + log);
	}

	@Override
	public void logWarning(String log) {
		System.out.println("[WARNING]: " + log);
	}

	@Override
	public void logError(String log) {
		System.out.println("[ERROR]: " + log);
	}
}
