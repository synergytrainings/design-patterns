package com.synisys.training.patterns.command;

import org.junit.Test;


public class TestCommand {

	@Test
	public void test(){
		Turtle turtle = new Turtle();
		TurtleController controller = new TurtleController();

		MoveCommand move = new MoveCommand(turtle, 1000);
		controller.queueCommand(move);

		RotateLeftCommand left= new RotateLeftCommand(turtle, 45);
		controller.queueCommand(left);

		controller.executeCommands();
		controller.undoCommands(1);
	}
}
