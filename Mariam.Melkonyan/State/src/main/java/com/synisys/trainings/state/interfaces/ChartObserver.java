package com.synisys.trainings.state.interfaces;

import com.synisys.trainings.state.impl.ChartType;

public interface ChartObserver {
	public void update(ChartType chartType);
}
