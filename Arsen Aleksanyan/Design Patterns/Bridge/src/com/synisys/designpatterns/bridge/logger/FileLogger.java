package com.synisys.designpatterns.bridge.logger;

import java.io.File;

public class FileLogger
		implements Logger {
	private File file;

	public FileLogger(File file) {
		this.file = file;
	}

	@Override
	public void logInfo(String log) {
		//TODO: Log to file
	}

	@Override
	public void logWarning(String log) {
		//TODO: Log to file
	}

	@Override
	public void logError(String log) {
		//TODO: Log to file
	}
}
