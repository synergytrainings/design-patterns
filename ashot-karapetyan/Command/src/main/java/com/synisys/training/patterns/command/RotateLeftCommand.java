package com.synisys.training.patterns.command;


public class RotateLeftCommand extends TurtleCommandBase {

	private double leftRotationAngle;

	public RotateLeftCommand(Turtle turtle, double leftRotationAngle){
		super(turtle);
		this.leftRotationAngle = leftRotationAngle;
	}


	@Override
	public void execute() {
		getTurtle().rotateLeft(this.leftRotationAngle);
	}

	@Override
	public void undo() {
		getTurtle().rotateRight(this.leftRotationAngle);
	}


}
