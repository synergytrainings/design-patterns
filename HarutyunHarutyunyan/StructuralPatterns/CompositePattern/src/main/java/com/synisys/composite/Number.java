package com.synisys.composite;

public class Number implements Expression {
	private Double number;

	public Number(Double number) {
		this.number = number;
	}

	public Double evaluate() {
		return number;
	}

	@Override
	public String toString() {
		return number + "";
	}
}
