package com.synisys.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
	private List<Indicator> indicators;
	
	public MediatorImpl(){
        this.indicators=new ArrayList<Indicator>();
    }

	public void setSO(Integer soId) {
		for(Indicator indicator : indicators){
			indicator.setSoId(soId);
		}
		
	}

	public void addIndicator(Indicator indicator) {
		indicators.add(indicator);
	}

	public List<Indicator> getIndicators() {
		return indicators;
	}
}
