package com.synisys.indicatorVisitor;

public class DelayeredIndicator implements Indicator{

	public String accept(IndicatorVisitor visitor) {
		return visitor.visit(this);
	}

}
