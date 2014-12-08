package main.com.synisys.trainings.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainings.designPatterns.FrameLog;

public class Composite implements FrameLog {
	List<FrameLog> frameLogs = new ArrayList<>();
		
	@Override
	public int getIndicatorsCount() {
		int count = 0;
		for (FrameLog frameLog : frameLogs){
			count += frameLog.getIndicatorsCount();
		}
		return count;
	}

	public void add(FrameLog frameLog) {
		frameLogs.add(frameLog);
	}

	public void remove(FrameLog frameLog) {
		frameLogs.remove(frameLog);
	}

	public List<FrameLog> getFrameLogs() {
		return frameLogs;
	}

	public FrameLog getFrameLog(int index) {
		return frameLogs.get(index);
	}

}
