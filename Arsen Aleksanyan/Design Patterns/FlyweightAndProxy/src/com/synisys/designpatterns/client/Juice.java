package com.synisys.designpatterns.client;

import java.util.ArrayList;
import java.util.List;

import com.synisys.designpatterns.flyweight.naturalproducts.NaturalProduct;
import com.synisys.designpatterns.flyweight.utils.Vitamin;

public class Juice {
	private List<NaturalProduct> naturalProducts = new ArrayList<NaturalProduct>();
	
	public Juice(List<NaturalProduct> naturalProducts){
		this.naturalProducts.addAll(naturalProducts);
	}
	
	public double consistenceOf(Vitamin vitamin){
		double vWeight = 0.0d;
		
		for(NaturalProduct naturalProduct : naturalProducts){
			vWeight += naturalProduct.consistenceOf(vitamin);
		}
		
		return vWeight;
	}
	
	public double getWeight(){
		double weight = 0.0d;
		
		for(NaturalProduct naturalProduct : naturalProducts){
			weight += naturalProduct.getWeight();
		}
		
		return weight;
	}
	
	public void drink(){
		
	}
}
