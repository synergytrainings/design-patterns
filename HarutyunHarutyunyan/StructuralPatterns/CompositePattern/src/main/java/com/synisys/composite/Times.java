package com.synisys.composite;

public class Times implements Expression {
	private Expression lt, rt;

	public Times(Expression l, Expression r) {
		lt = l;
		rt = r;
	}

	public Double evaluate() {
		return lt.evaluate() * rt.evaluate();
	}
	
	@Override
	public String toString() {
		return "(" + lt.toString() + " * " + rt.toString() + ")";
	}
}
