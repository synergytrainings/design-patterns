package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.utils.ProductType;

public class AbstractFactoryDemo {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		AbstractFactory auctionFactory = ProductFactory.getFactory("AUCTION");
		Product carForAuction = auctionFactory.getProduct(ProductType.CAR);
		
		Product bootsForAuction = auctionFactory.getProduct(ProductType.BOOTS);
		
		AbstractFactory marketFactory = ProductFactory.getFactory("MARKET");
		
		Product carForSelling = marketFactory.getProduct(ProductType.CAR);
		
		Product bootsForSelling = marketFactory.getProduct(ProductType.BOOTS);
	}
}
