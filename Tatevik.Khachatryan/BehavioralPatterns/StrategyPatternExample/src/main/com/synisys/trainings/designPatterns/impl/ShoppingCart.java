package main.com.synisys.trainings.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainings.designPatterns.PaymentStrategy;

public class ShoppingCart {
	List<Item> items;
	
	public ShoppingCart(){
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotalPrice(){
		int total = 0;
		for (Item item : this.items){
			total += item.getPrice();
		}
		return total;
	}
	
	public void pay(PaymentStrategy strategy) throws OperationCanceledException{
		strategy.pay(calculateTotalPrice());
	}
}
