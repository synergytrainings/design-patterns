package com.synisys.designpatterns.decorator.food;

public class Cabbage extends AbstractFood{
	public Cabbage(double weightInGrams){
		super(weightInGrams);
	}
	
	@Override
	double getCaloriesIn100Gram() {
		return 25;
	}
}
