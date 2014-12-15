package com.synisys.training.patterns.command;


public class MoveCommand extends TurtleCommandBase {

	private int forwardDistance;

	public MoveCommand(Turtle turtle, int forwardDistance){
		super(turtle);
		this.forwardDistance = forwardDistance;
	}


	@Override
	public void execute() {
		getTurtle().move(this.forwardDistance);
	}

	@Override
	public void undo() {
		getTurtle().move(-1 * this.forwardDistance);
	}


}
