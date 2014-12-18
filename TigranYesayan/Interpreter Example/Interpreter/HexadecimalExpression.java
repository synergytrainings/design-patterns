package com.synisys.trainings.Interpreter;

public class HexadecimalExpression implements Expression {
	private int number;

	public HexadecimalExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(Context context) {
		return context.getNumberInHexadecimal(number);
	}

}
