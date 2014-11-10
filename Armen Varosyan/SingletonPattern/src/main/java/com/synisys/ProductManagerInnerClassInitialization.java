package com.synisys;

import java.util.ArrayList;
import java.util.List;

import com.synisys.models.Product;

public class ProductManagerInnerClassInitialization {
	private List<Product> products ;

	public List<Product> getProducts() {
		if(products == null){
			products = new ArrayList<Product>();
		}
		return products;
	}
	
	private static class ProductManagerInnerClassInitializationnHolder {
		private static final ProductManagerInnerClassInitialization INSTANCE = new ProductManagerInnerClassInitialization();
	}

	public static ProductManagerInnerClassInitialization getInstance() {
		return ProductManagerInnerClassInitializationnHolder.INSTANCE;
	}
}
