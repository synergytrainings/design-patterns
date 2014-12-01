package com.synisys.designpatterns.client;

import java.util.Arrays;
import java.util.List;

import com.synisys.designpatterns.flyweight.naturalproducts.Fruit;
import com.synisys.designpatterns.flyweight.naturalproducts.NaturalProduct;
import com.synisys.designpatterns.flyweight.naturalproducts.Vegetable;
import com.synisys.designpatterns.flyweight.utils.Vitamin;

public class JuiceReceipes {
	static{
		//Ginger
		new NaturalProduct(){
			{ 
				vitmainWeights.put(Vitamin.B1, 0.046);
				vitmainWeights.put(Vitamin.B2, 0.17);
				vitmainWeights.put(Vitamin.B3, 9.62);
				vitmainWeights.put(Vitamin.B5, 0.477);
				vitmainWeights.put(Vitamin.B6, 0.626);
				vitmainWeights.put(Vitamin.B9, 0.0013);
				vitmainWeights.put(Vitamin.C, 0.7);
			}
		}.register("ginger");
	}
	
	private static List<Juice> receipes = Arrays.asList(
				makePinkPanther(),
				makeGingerParadise(),
				makeCitrusSensation(),
				makeTheEyeOpener()
			);
	
	private JuiceReceipes(){  }
	
	private static Juice makePinkPanther(){
		return new Juice(Arrays.asList(NaturalProduct.ofType(Fruit.APPLE).ofWeight(150),
				   					   NaturalProduct.ofType(Vegetable.WATERMELON).ofWeight(120),
				   					   NaturalProduct.ofType(Fruit.STRAWBERRY).ofWeight(100),
				   					   NaturalProduct.ofType(Fruit.ORANGE).ofWeight(80)));
	}
	
	private static Juice makeGingerParadise(){
		return new Juice(Arrays.asList(NaturalProduct.ofType(Vegetable.CARROT).ofWeight(150),
									   NaturalProduct.ofType(Fruit.APPLE).ofWeight(80),
									   NaturalProduct.of("ginger").ofWeight(30)));
	}
	
	private static Juice makeCitrusSensation(){
		return new Juice(Arrays.asList(NaturalProduct.ofType(Fruit.PEACH).ofWeight(150),
									   NaturalProduct.ofType(Fruit.APPLE).ofWeight(120),
									   NaturalProduct.ofType(Fruit.GRAPEFRUIT).ofWeight(90)));
	}
	
	private static Juice makeTheEyeOpener(){
		return new Juice(Arrays.asList(NaturalProduct.ofType(Vegetable.CARROT).ofWeight(150),
				   					   NaturalProduct.ofType(Fruit.APPLE).ofWeight(60),
				   					   NaturalProduct.ofType(Fruit.ORANGE).ofWeight(40)));
	}
	
	public static Juice findJuiceWithTheMost(Vitamin vitamin){
		double weight = 0.0d;
		double cur = 0.0d;
		
		Juice curJuice = null;
		
		for(Juice juice : receipes){
			cur = 100 * juice.consistenceOf(vitamin) / juice.getWeight();
			if(weight < cur){
				weight = cur;
				curJuice = juice;
			}
		}
		
		return curJuice;
	}
}
