package com.synisys.trainings.State;

public class Demo {
	public static void main(String[] args) {
		Context context = new Context();
		State lightOnState = new LightOn();
		State lightOffState = new LightOff();

		context.setState(lightOnState);
		context.doAction();

		context.setState(lightOffState);
		context.doAction();
	}
}
