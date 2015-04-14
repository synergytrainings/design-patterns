package com.synisys.trainings.Strategy;

import java.util.ArrayList;

public class Context {
	private final Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void calculateRows(ArrayList<Row> rows) {
		strategy.calculate(rows);
	}
}
