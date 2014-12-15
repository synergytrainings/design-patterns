package com.synisys.training.patterns.command;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TurtleController {

	public Queue<TurtleCommand> commands;
	private Stack<TurtleCommand> undoStack;

	public TurtleController()
	{
		this.commands = new LinkedList<>();
		this.undoStack = new Stack<>();
	}

	public void queueCommand(TurtleCommand command){
		this.commands.add(command);
	}

	public void executeCommands()
	{
		while (this.commands.size() > 0)
		{
			TurtleCommand command = this.commands.poll();
			command.execute();
			this.undoStack.push(command);
		}
	}
	public void undoCommands(int numUndos)
	{
		while (numUndos > 0 && this.undoStack.size() > 0)
		{
			TurtleCommand command = this.undoStack.pop();
			command.undo();
			numUndos--;
		}
	}
}
