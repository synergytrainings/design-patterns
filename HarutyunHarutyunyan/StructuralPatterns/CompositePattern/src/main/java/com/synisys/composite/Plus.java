package com.synisys.composite;

import java.util.List;

public class Plus implements Expression {
	private Expression lt, rt;
	public Plus(Expression l, Expression r) {
		lt = l;
		rt = r;
	}

	public Double evaluate() {
		return lt.evaluate() + rt.evaluate();
	}
	
	@Override
	public String toString() {
		return "(" + lt.toString() + " + " + rt.toString() + ")";
	}
}
