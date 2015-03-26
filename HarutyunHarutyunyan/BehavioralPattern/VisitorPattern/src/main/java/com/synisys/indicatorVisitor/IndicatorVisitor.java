package com.synisys.indicatorVisitor;

public interface IndicatorVisitor {
	public String visit(LayeredIndicator indicator);
	public String visit(DelayeredIndicator indicator);
}
