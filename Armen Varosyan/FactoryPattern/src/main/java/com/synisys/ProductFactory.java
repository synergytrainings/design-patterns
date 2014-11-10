package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.models.Boots;
import com.synisys.models.Car;
import com.synisys.utils.ProductType;

public class ProductFactory {
	public Product getProduct(ProductType productType) throws ClassNotFoundException {
		switch (productType) {
		case CAR:
			return new Car();
		case BOOTS:
			return new Boots();

		default:
			throw new IllegalArgumentException("Unsupported product type '" + productType.toString() + "'");
		}
	}
}
