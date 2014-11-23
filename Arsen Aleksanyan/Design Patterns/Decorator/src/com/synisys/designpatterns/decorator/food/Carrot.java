package com.synisys.designpatterns.decorator.food;

public class Carrot extends AbstractFood {
	
	public Carrot(double weightInGramms) {
		super(weightInGramms);
	}
	
	@Override
	double getCaloriesIn100Gram() {
		return 41;
	}
}
