package design.patterns.composite;

import java.util.Random;

public class ArithmeticExpression implements Expression {
	
	private int value;
	
	public ArithmeticExpression(){
		this.value = new Random().nextInt();
	}

	@Override
	public int calculate() {
		return value;
	}

}
