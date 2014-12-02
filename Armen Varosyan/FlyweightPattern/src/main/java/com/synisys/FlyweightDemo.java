package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.utils.ProductType;

public class FlyweightDemo {
	public static void main(String[] args){
		ProductFactory factory = new ProductFactory();
		Product car1 = factory.getProduct(ProductType.CAR);
		Product boots = factory.getProduct(ProductType.SPORT);
		Product car2 = factory.getProduct(ProductType.CAR);
		
	}
}
