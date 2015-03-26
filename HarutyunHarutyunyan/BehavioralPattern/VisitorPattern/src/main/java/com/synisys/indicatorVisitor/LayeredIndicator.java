package com.synisys.indicatorVisitor;

public class LayeredIndicator implements Indicator{

	public String accept(IndicatorVisitor visitor) {
		 return visitor.visit(this);
	}

}
