package com.synisys.training.patterns.parser;


public class NodeVisitorResultImpl<T> implements NodeVisitorResult<T> {

	private final T value;
	private final ResultStatus resultStatus;

	public NodeVisitorResultImpl(T value, ResultStatus resultStatus){
		this.value = value;
		this.resultStatus = resultStatus;
	}

	@Override
	public ResultStatus getResultStatus() {
		return resultStatus;
	}

	@Override
	public T getValue() {
		return value;
	}
}
