package com.synisys.chainOfResponsibility;

public class ZeroProcessor extends Chain {

	public void process(Number request) {
		if (request.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}