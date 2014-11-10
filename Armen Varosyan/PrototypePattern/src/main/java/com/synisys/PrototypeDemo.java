package com.synisys;

import java.util.HashMap;
import java.util.Map;

import com.synisys.models.Boots;
import com.synisys.models.Car;
import com.synisys.models.Product;
import com.synisys.utils.ProductType;

public class PrototypeDemo {
	private static Map<ProductType, Product> products = new HashMap<ProductType, Product>();
	
	static{
		products.put(ProductType.CAR, new Car(10, "BMW", "335i"));
		products.put(ProductType.BOOTS, new Boots(20, "Adidas", 42));
	}
	
	public Product getProductClone(ProductType productType){
		return products.get(productType).clone();
	}
}
