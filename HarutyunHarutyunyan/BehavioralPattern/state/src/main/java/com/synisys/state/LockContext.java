package com.synisys.state;

public class LockContext {
	private State currentState;

	public LockContext() {
		currentState = new UnlockState();
	}

	// I think it is unnecessary 
	public void setState(State state) {
		this.currentState = state;
	}

	// I think it is unnecessary 
	public State getState() {
		return currentState;
	}

	public void doAction() {
		currentState.doAction(this);
	}
}
