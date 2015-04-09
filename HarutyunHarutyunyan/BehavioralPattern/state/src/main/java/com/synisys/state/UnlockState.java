package com.synisys.state;

public class UnlockState implements State {

	public void doAction(LockContext context) {
		System.out.println("Lock Project");
		context.setState(new LockState());
	}
}
