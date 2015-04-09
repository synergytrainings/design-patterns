package com.synisys.trainings.State;

public class LightOff implements State{
	@Override
    public void doAction() {
        System.out.println("Light is off");
    }
}
