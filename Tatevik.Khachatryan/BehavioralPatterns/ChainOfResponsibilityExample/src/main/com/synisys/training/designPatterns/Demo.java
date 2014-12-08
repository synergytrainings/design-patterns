package main.com.synisys.training.designPatterns;

import main.com.synisys.training.designPatterns.impl.*;

public class Demo {
	   public static void main(String[] args) {
	      Logger loggerChain = setUpChain();

	      loggerChain.logMessage(Logger.INFO, "This is an information.");

	      loggerChain.logMessage(Logger.DEBUG, "This is an debug level information.");

	      loggerChain.logMessage(Logger.ERROR, "This is an error information.");
	   }
	   
		private static Logger setUpChain(){
			  Logger fileLogger = new FileLogger(Logger.DEBUG);			 
		      Logger errorLogger = new ErrorLogger(Logger.ERROR);
		      Logger consoleLogger = new ConsoleLogger(Logger.INFO);		      
		      
		      fileLogger.setNextLogger(errorLogger);
		      errorLogger.setNextLogger(consoleLogger);		      

		      return fileLogger;	
		   }

}
