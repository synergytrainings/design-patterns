package com.synisys.trainings.ChainOfResponsibility;

public class HandlerOne extends Handler{
	
	public void handleRequest(Request request)
	{
		if (request.getValue() < 0){
			System.out.println("Negative values are handled by HandlerOne:");
			System.out.println("HandlerOne.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
	}

}
