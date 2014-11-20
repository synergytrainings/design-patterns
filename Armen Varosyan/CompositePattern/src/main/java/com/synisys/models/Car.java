package com.synisys.models;

import com.synisys.interfaces.Product;

public class Car implements Product {
	private int price;

	public Car(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
