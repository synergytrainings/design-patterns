package com.synisys;

import com.synisys.interfaces.Product;

public  class ProductDecorator implements Product{
	private Product product;

	public ProductDecorator(Product product) {
		super();
		this.product = product;
	}

	public String getDescription() {
		return product.getDescription();
	}
	
}
