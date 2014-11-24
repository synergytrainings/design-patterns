package com.synisys.models;

import com.synisys.ProductDecorator;
import com.synisys.interfaces.Product;

public class FruitDecorator extends ProductDecorator{

	public FruitDecorator(Product product) {
		super(product);
	}

	public String getDescription() {
		return "Fruit categoria " + super.getDescription();
	}

}
