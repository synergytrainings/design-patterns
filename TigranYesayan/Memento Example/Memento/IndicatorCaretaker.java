package com.synisys.trainings.Memento;

import java.util.ArrayList;
import java.util.List;

public class IndicatorCaretaker {
	
	private List<IndicatorMemento> indicatorStates = new ArrayList<IndicatorMemento>();

	public void addMemento(IndicatorMemento indicatorMemento) {
		indicatorStates.add(indicatorMemento);
	}

	public IndicatorMemento getMemento(int index) {
		return indicatorStates.get(index);
	}

}
