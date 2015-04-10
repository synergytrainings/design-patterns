package com.synisys.trainings.state.interfaces;

public interface Model {
	public void attach(ChartObserver observer);

	public void detach(ChartObserver observer);

}
