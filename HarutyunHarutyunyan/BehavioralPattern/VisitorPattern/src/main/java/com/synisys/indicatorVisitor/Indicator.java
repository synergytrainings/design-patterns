package com.synisys.indicatorVisitor;

public interface Indicator {
	public String accept(IndicatorVisitor visitor);
}
