package com.synisys.training.patterns.parser;


public interface NodeVisitorResult<T> {

	public enum ResultStatus{
		CONTINUE,
		TERMINATE
	}

	ResultStatus getResultStatus();

	T getValue();
}
