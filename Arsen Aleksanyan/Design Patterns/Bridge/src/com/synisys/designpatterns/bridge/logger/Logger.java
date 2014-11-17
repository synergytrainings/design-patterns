package com.synisys.designpatterns.bridge.logger;

public interface Logger {
	void logInfo(String log);

	void logWarning(String log);

	void logError(String log);
}
