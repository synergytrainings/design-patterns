package com.synisys.trainings.State;

public class Context implements State{
	private State state;
	 
    public void setState(State state) {
        this.state=state;
    }
 
    public State getState() {
        return this.state;
    }
 
    @Override
    public void doAction() {
        this.state.doAction();
    }
}
