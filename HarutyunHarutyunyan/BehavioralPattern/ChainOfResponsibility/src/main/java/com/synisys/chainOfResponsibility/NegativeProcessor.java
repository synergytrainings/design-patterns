package com.synisys.chainOfResponsibility;

public class NegativeProcessor extends Chain {

	public void process(Number request) {
		if (request.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
