package com.synisys.trainings.Interpreter;

public class BinaryExpression implements Expression {
	private int number;

	public BinaryExpression(int number) {
		this.number = number;
	}

	@Override
	public String interpret(Context context) {
		return context.getNumberInBinary(this.number);
	}
}
