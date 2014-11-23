package com.synisys.designpatterns.decorator.food;

import java.util.ArrayList;
import java.util.List;

public class FoodMixture implements Food {
	private List<Food> mixFoods = new ArrayList<>();
	private Double calories = null;
	private Double weight = null;
	
	public FoodMixture(Food... foods){
		for(Food food : foods){
			mixFoods.add(food);
		}
	}
	
	@Override
	public double getCalories() {
		if(calories == null){
			calories = 0d;
			
			for(Food food : mixFoods){
				calories += food.getCalories();
			}
		}
		
		return calories;
	}
	
	@Override
	public double getWeight() {
		if(weight == null){
			weight = 0d;
			
			for(Food food : mixFoods){
				weight += food.getWeight();
			}
		}
		return weight;
	}
}
