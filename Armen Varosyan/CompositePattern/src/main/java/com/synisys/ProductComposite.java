package com.synisys;

import java.util.ArrayList;
import java.util.List;

import com.synisys.interfaces.Product;

public class ProductComposite implements Product{
	private List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product){
		this.products.add(product);
	}
	
	public void removeProduct(Product product){
		this.products.remove(product);
	}
	
	public int getPrice() {
		Integer price = 0;
		for(Product product:this.products){
			price += product.getPrice();
		}
		return price;
	}

}
