package com.synisys.training.patterns.command;


public class RotateRightCommand extends TurtleCommandBase {

	private double leftRotationAngle;

	public RotateRightCommand(Turtle turtle, double leftRotationAngle){
		super(turtle);
		this.leftRotationAngle = leftRotationAngle;
	}


	@Override
	public void execute() {
		getTurtle().rotateRight(this.leftRotationAngle);
	}

	@Override
	public void undo() {
		getTurtle().rotateLeft(this.leftRotationAngle);
	}


}
