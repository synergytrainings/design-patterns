package com.synisys.composite;

public class Minus implements Expression {
	Expression lt, rt;

	public Minus(Expression l, Expression r) {
		lt = l;
		rt = r;
	}

	public Double evaluate() {
		return lt.evaluate() - rt.evaluate();
	}
	
	@Override
	public String toString() {
		return "(" + lt.toString() + " - " + rt.toString() + ")";
	}
}
