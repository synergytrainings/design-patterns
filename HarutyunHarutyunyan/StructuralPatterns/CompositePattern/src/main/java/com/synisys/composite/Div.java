package com.synisys.composite;

public class Div implements Expression {
	private Expression lt, rt;

	public Div(Expression l, Expression r) {
		lt = l;
		rt = r;
	}

	public Double evaluate() {
		return lt.evaluate() / rt.evaluate();
	}
	
	@Override
	public String toString() {
		return "(" + lt.toString() + " / " + rt.toString() + ")";
	}
}
