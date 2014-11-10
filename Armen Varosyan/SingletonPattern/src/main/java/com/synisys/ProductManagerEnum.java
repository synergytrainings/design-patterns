package com.synisys;

import java.util.ArrayList;
import java.util.List;

import com.synisys.models.Product;

public enum ProductManagerEnum {
	INSTANCE ;
	
	private List<Product> products ;

	public List<Product> getProducts() {
		if(products == null){
			products = new ArrayList<Product>();
		}
		return products;
	}
	
}

