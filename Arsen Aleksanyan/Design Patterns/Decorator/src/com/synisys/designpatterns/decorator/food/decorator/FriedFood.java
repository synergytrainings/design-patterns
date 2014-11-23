package com.synisys.designpatterns.decorator.food.decorator;

import com.synisys.designpatterns.decorator.food.Food;

public class FriedFood implements Food {
	private float frySeconds;
	private Food food;
	
	public FriedFood(Food food, float frySeconds){
		this.food = food;
		this.frySeconds = frySeconds;
	}
	
	@Override
	public double getWeight() {
		//TODO: calculate and return fried food weight
		return 0;
	}
	
	@Override
	public double getCalories() {
		return food.getCalories() + frySeconds * food.getCalories() * 20 / ( 100 * (frySeconds - 1) );
	}
}
