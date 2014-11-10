package com.synisys;

import java.util.ArrayList;
import java.util.List;

import com.synisys.models.Product;

public class ProductManagerEagerInitialization {
	private static final ProductManagerEagerInitialization INSTANCE = new ProductManagerEagerInitialization();
	private List<Product> products;
	
	/**
	 * A private Constructor prevents any other 
	 */
	private ProductManagerEagerInitialization(){}

	public List<Product> getProducts() {
		if (products == null) {
			products = new ArrayList<Product>();
		}
		return products;
	}
	
	public static ProductManagerEagerInitialization getInstance(){
		return INSTANCE;
	}
}
