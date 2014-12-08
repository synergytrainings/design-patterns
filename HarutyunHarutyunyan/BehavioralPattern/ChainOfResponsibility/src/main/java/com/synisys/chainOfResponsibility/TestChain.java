package com.synisys.chainOfResponsibility;

public class TestChain {
	public static void main(String[] args) {
		//configure Chain of Responsibility
		Chain chain1 = new NegativeProcessor();
		Chain chain2 = new ZeroProcessor();
		Chain chain3 = new PositiveProcessor();
		chain1.setNext(chain2);
		chain2.setNext(chain3);

		//calling chain of responsibility
		chain1.process(new Number(99));
		chain1.process(new Number(-30));
		chain1.process(new Number(0));
		chain1.process(new Number(100));
	}
}
