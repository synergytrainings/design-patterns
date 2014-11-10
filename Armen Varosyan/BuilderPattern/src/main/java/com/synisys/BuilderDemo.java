package com.synisys;

import com.synisys.models.Product;
import com.synisys.utils.ProductType;

public class BuilderDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Product product =new Product.ProductBuilder().name("BMW").price(12).productType(ProductType.CAR).build();
	}
	
}
