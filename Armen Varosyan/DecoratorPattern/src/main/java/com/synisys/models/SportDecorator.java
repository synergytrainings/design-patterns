package com.synisys.models;

import com.synisys.ProductDecorator;
import com.synisys.interfaces.Product;

public class SportDecorator extends ProductDecorator{

	public SportDecorator(Product product) {
		super(product);
	}

	public String getDescription() {
		return "Sport categoria " + super.getDescription();
	}

}
