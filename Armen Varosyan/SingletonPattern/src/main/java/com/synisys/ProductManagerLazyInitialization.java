package com.synisys;

import java.util.ArrayList;
import java.util.List;

import com.synisys.models.Product;

public class ProductManagerLazyInitialization {
	private static  ProductManagerLazyInitialization INSTANCE = null;
	private List<Product> products;
	
	/**
	 * A private Constructor prevents any other 
	 */
	private ProductManagerLazyInitialization(){}

	public List<Product> getProducts() {
		if (products == null) {
			products = new ArrayList<Product>();
		}
		return products;
	}
	
	public static ProductManagerLazyInitialization getInstance(){
		if (INSTANCE == null) {
            synchronized(ProductManagerLazyInitialization.class){
                if (INSTANCE == null) { // Double checking
                    INSTANCE = new ProductManagerLazyInitialization();
                }
            }
        }
        return INSTANCE;
	}
}
