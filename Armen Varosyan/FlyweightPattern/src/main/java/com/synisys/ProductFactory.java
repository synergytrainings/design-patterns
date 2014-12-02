package com.synisys;

import java.util.HashMap;
import java.util.Map;

import com.synisys.interfaces.Product;
import com.synisys.models.ProductImpl;
import com.synisys.utils.ProductType;

public class ProductFactory {
	
	private static final Map<ProductType, Product> products = new HashMap<ProductType, Product>();
	
	public Product getProduct(ProductType productType){
		Product product = products.get(productType) ;
		if(product == null){
			product = CreateProduct(productType);
			products.put(productType, product);
		}
		return product;
	}
	
	private Product CreateProduct(ProductType productType){
		return new ProductImpl(productType);
	}

}
