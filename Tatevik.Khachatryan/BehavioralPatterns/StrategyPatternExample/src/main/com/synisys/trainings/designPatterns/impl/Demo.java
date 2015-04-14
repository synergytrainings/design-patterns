package main.com.synisys.trainings.designPatterns.impl;

import java.util.Date;

public class Demo {
	public static void main(String[] args){
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item("Notebook lenovo", 8000));
		cart.addItem(new Item("Headphone", 1500));
		
		//pay by paypal
		try {
			cart.pay(new PaypalStrategy("tatevik@gmail.com", "mypassword"));
		} catch (OperationCanceledException e) {
			System.out.println(e.getMessage());
			
			//pay by credit card
			try {
				cart.pay(new CreditCardStrategy("Tatevik", "A1989078", new Date(2015, 12, 20)));
			} catch (OperationCanceledException e1) {
				System.out.println(e.getMessage());
			}
		}
	}
}
