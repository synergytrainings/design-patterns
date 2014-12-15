package com.synisys.trainings.ChainOfResponsibility;

public class HandlerTwo extends Handler{
	public void handleRequest(Request request)
	{
		if (request.getValue() > 0){
			System.out.println("Positive values are handled by HandlerTwo:");
			System.out.println("HandlerTwo.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
	}
}
