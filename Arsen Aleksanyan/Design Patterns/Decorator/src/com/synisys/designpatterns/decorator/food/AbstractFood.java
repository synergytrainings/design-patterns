package com.synisys.designpatterns.decorator.food;

public abstract class AbstractFood implements Food {
	private double weight;
	private Double calories = null;
	
	public AbstractFood(double weightInGramms){
		this.weight = weightInGramms;
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
	
	abstract double getCaloriesIn100Gram();
	
	@Override
	public double getCalories() {
		if(calories == null){
			calories = getWeight() * getCaloriesIn100Gram() / 100;
		}
		return calories;
	}
}
