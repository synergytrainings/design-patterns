package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.models.Car;


public class CompositeDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Product car1 = new Car(10);
		Product car2 = new Car(15);
		
		ProductComposite productComposite = new ProductComposite();
		
		productComposite.addProduct(car1);
		productComposite.addProduct(car2);
		
		System.out.println(car1.getPrice());
		System.out.println(car2.getPrice());
		System.out.println(productComposite.getPrice());

	}
}
