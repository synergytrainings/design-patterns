package com.synisys.chainOfResponsibility;

public abstract class Chain {
	protected Chain nextInChain;

	/*
	 * There might be cases where some logic is involved for setNext in that
	 * case we can create interface Chain and move the implementation for each
	 * child individually
	 */
	public void setNext(Chain c) {
		nextInChain = c;
	}

	public abstract void process(Number request);
}
