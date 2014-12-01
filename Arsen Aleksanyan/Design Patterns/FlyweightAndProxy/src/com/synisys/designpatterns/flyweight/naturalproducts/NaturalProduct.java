package com.synisys.designpatterns.flyweight.naturalproducts;

import java.util.HashMap;
import java.util.Map;

import com.synisys.designpatterns.flyweight.utils.Vitamin;
import com.synisys.designpatterns.proxy.naturalproducts.WeightfulNaturalProduct;

public abstract class NaturalProduct {
	
	//vitamin milligrams in 100gram product
	protected Map<Vitamin, Double> vitmainWeights = new HashMap<Vitamin, Double>();
	
	//natural product pool
	private static Map<String, NaturalProduct> naturalProducts = new HashMap<String, NaturalProduct>();
	
	public static NaturalProduct ofType(NaturalProductType productType){
		try{
			if(of(productType.getKey()) == null){
				synchronized(naturalProducts){
					if(of(productType.getKey()) == null){
						productType.getProductClass().newInstance().register(productType.getKey());
					}
				}
			}
			
			return of(productType.getKey());
		}
		catch(IllegalAccessException | InstantiationException e){
			
			return null;
		}
	}
	
	public static NaturalProduct of(String key){
		return naturalProducts.get(key);
	}
	
	public NaturalProduct ofWeight(double weight){
		return new WeightfulNaturalProduct(this, weight);
	}
	
	//Pool registrator for external natural product
	public final void register(String key){
		if(of(key) == null){
			synchronized(naturalProducts){
				if(of(key) == null){
					naturalProducts.put(key, this);
					return;
				}
			}
		}
		
		throw new IllegalArgumentException("Natural product with key already registered");
	}
	
	//in milligrams
	public double consistenceOf(Vitamin vitamin){
		Double vWeight = vitmainWeights.get(vitamin);
		if(vWeight == null){
			vWeight = 0.0d;
		}
		
		return getWeight() * vWeight / 100;
	}
	
	//in grams
	public double getWeight(){
		return 100d;
	}
}
