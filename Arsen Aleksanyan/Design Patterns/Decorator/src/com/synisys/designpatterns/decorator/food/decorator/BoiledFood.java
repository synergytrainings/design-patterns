package com.synisys.designpatterns.decorator.food.decorator;

import com.synisys.designpatterns.decorator.food.Food;

public class BoiledFood implements Food{
	private Food food;
	private float boilSeconds;
	
	public BoiledFood(Food food, float boilSeconds){
		this.food = food;
		this.boilSeconds = boilSeconds;
	}
	
	@Override
	public double getWeight() {
		//TODO: calculate and return boiled food weight
		return 0;
	}
	
	@Override
	public double getCalories() {
		return food.getCalories() - boilSeconds * food.getCalories() * 20 / ( 100 * (boilSeconds - 1) );
	}
}
