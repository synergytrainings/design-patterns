package com.synisys.designpatterns.bridge.performance.logger;

import java.util.Date;

import com.synisys.designpatterns.bridge.logger.Logger;

public class PerformanceLoggerImpl
		implements PerformanceLogger {
	private Logger logger;
	private Date startDate = null;
	private boolean isEnded = false;
	private int allowedTimeInMills;
	private Object forObject;

	public PerformanceLoggerImpl(Logger logger, Object forObject, int allowedTimeInMills) {
		this.logger = logger;
		this.forObject = forObject;
		this.allowedTimeInMills = allowedTimeInMills;
	}

	@Override
	public synchronized void startLog() {
		if (startDate != null) {
			throw new IllegalStateException("Performance logger already started");
		}
		startDate = new Date();

		logger.logInfo(String.format("Performance logger for %s started at %s", forObject, startDate));
	}

	@Override
	public synchronized void endLog() {
		Date endDate = new Date();

		if (startDate == null) {
			throw new IllegalStateException("Performance logger is not started");
		}
		if (isEnded) {
			throw new IllegalStateException("Performance logger already ended");
		}

		long durationTime = endDate.getTime() - startDate.getTime();

		logger.logInfo(String.format("Performance logger for %s ended at %s and lasts %s seconds", forObject, endDate,
				(double) durationTime / 1000));

		if (durationTime > allowedTimeInMills) {
			logger.logWarning(String.format(
					"Allowable execution duration for %s is %s seconds, but is was last %s seconds", forObject,
					(double) allowedTimeInMills / 1000, (double) durationTime / 1000));
		}

		isEnded = true;
	}
}
