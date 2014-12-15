package com.synisys.trainings.ChainOfResponsibility;

public class HandlerThree extends Handler{
	
	public void handleRequest(Request request)
	{
		if (request.getValue() >= 0){
			System.out.println("Zero values are handled by HandlerThree:");
			System.out.println("HandlerThree.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
	}

}
