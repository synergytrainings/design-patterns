package com.synisys.state;

public class LockState implements State {

	public void doAction(LockContext context) {
		System.out.println("Unlock Project");
		context.setState(new UnlockState());
	}
}
