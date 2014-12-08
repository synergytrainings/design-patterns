package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Logger;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println(String.format("Logging message %s using Console Logger (level is %s)", message, this.level));
	}

}
