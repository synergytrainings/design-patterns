package com.synisys.designpatterns.proxy.naturalproducts;

import com.synisys.designpatterns.flyweight.naturalproducts.NaturalProduct;
import com.synisys.designpatterns.flyweight.utils.Vitamin;

public class WeightfulNaturalProduct extends NaturalProduct {
	private NaturalProduct naturalProduct;
	private double weight;
	
	public WeightfulNaturalProduct(NaturalProduct naturalProduct, double weight){
		this.naturalProduct = naturalProduct;
		this.weight = weight;
	}
	
	@Override
	public double consistenceOf(Vitamin vitamin) {
		return naturalProduct.consistenceOf(vitamin);
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
}
