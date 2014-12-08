package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Logger;

public class ErrorLogger extends Logger {

	public ErrorLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println(String.format("Logging message %s using Error Logger (level is %s)", message, this.level));
	}

}
