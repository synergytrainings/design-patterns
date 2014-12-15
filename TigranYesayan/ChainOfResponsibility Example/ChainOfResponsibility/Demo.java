package com.synisys.trainings.ChainOfResponsibility;

public class Demo {
	
	public static void main(String[] args) {
		Handler h1 = new HandlerOne();
		Handler h2 = new HandlerTwo();
		Handler h3 = new HandlerThree();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		h1.handleRequest(new Request("Negative Value ", -1));
		h1.handleRequest(new Request("Negative Value ",  0));
		h1.handleRequest(new Request("Negative Value ",  1));
		h1.handleRequest(new Request("Negative Value ",  2));
		h1.handleRequest(new Request("Negative Value ", -5));	 
	}
	
}
