package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.utils.ProductType;

public class FactoryDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		ProductFactory productFactor = new ProductFactory();

		Product car = productFactor.getProduct(ProductType.CAR);

		Product boots = productFactor.getProduct(ProductType.BOOTS);

		Product table = productFactor.getProduct(ProductType.TABLE);

	}
}
