package com.synisys.state;

public class LockContext {
	private State currentState;

	public LockContext() {
		currentState = new UnlockState();
	}

	public void setState(State state) {
		this.currentState = state;
	}

	public State getState() {
		return currentState;
	}

	public void doAction() {
		currentState.doAction(this);
	}
}
