package com.synisys.designpatterns.decorator.food;

public class Onion extends AbstractFood {

	public Onion(double weightInGrams){
		super(weightInGrams);
	}
	
	@Override
	double getCaloriesIn100Gram() {
		return 40;
	}
}
