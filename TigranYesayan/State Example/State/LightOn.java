package com.synisys.trainings.State;

public class LightOn implements State {
	@Override
	public void doAction() {
		System.out.println("Light is On");
	}
}
