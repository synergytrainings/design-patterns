package com.synisys.designpatterns.decorator.food;

public class Beef extends AbstractFood {
	
	public Beef(double weightInGrams){
		super(weightInGrams);
	}
	
	@Override
	double getCaloriesIn100Gram() {
		return 250;
	}
}
