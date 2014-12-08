package com.synisys.chainOfResponsibility;

public class PositiveProcessor extends Chain {

	public void process(Number request) {
		if (request.getNumber() > 0) {
			System.out.println("PositiveProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}