package com.synisys.state;

public class DemoState {
	public static void main(String[] args) {
		LockContext context = new LockContext();

		context.doAction();
		context.doAction();
		context.doAction();
		context.doAction();
		context.doAction();
		context.doAction();
	}
}
