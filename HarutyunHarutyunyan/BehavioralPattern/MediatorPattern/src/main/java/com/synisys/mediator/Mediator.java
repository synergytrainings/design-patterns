package com.synisys.mediator;

import java.util.List;

public interface Mediator {
	public void setSO(Integer soId);
	 
    public void addIndicator(Indicator indicator);
    
    public List<Indicator> getIndicators();
}
