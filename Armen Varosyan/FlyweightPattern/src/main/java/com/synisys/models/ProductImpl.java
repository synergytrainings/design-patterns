package com.synisys.models;

import com.synisys.interfaces.Product;
import com.synisys.utils.ProductType;

public class ProductImpl implements Product{
	private ProductType productType;
	
	public ProductImpl (ProductType productType){
		this.productType = productType;
	}

	public ProductType getProductType() {
		return productType;
	}

}
