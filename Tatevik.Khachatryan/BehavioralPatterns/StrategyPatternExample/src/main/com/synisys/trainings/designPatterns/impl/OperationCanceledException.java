package main.com.synisys.trainings.designPatterns.impl;

public class OperationCanceledException extends Exception {
	//Parameterless Constructor
    public OperationCanceledException() {}

    //Constructor that accepts a message
    public OperationCanceledException(String message)
    {
       super(message);
    }
}
