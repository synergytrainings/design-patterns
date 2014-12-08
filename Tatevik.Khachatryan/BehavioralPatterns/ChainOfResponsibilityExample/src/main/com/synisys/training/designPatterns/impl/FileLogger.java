package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Logger;

public class FileLogger extends Logger {

	public FileLogger(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println(String.format("Logging message %s using File Logger (level is %s)", message, this.level));
	}

}
