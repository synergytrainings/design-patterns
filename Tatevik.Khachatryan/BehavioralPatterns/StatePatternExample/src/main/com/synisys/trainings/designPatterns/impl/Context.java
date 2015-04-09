package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.State;

public class Context {
	private State currentState;

	   public Context(){
	      currentState = new ViewModeState();
	   }

	   public void setState(State state){
	      this.currentState = state;		
	   }

	   public State getState(){
	      return currentState;
	   }
	   
	   public void printForm() {
			currentState.printForm(this);
	   }
}
