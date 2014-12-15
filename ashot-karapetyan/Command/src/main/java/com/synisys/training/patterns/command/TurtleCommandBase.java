package com.synisys.training.patterns.command;


public abstract class TurtleCommandBase implements TurtleCommand {

	private Turtle turtle;

	public TurtleCommandBase(Turtle turtle){
		this.turtle = turtle;
	}

	@Override
	public abstract void execute();

	@Override
	public abstract  void undo();

	protected Turtle getTurtle() {
		return turtle;
	}
}
