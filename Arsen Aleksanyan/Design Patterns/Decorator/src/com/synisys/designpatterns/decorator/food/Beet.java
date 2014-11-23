package com.synisys.designpatterns.decorator.food;

public class Beet extends AbstractFood {
	
	public Beet(double weightInGramms){
		super(weightInGramms);
	}
	
	@Override
	double getCaloriesIn100Gram() {
		return 43;
	}
}
