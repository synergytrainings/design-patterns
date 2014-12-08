package main.com.synisys.training.designPatterns;

public abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	// next element in chain or responsibility
	protected Logger nextLogger;

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		// write message using current logger if level matches...
		if (this.level <= level) {
			write(message);
		}
		
		// if logger has a child logger, pass message to next logger
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
