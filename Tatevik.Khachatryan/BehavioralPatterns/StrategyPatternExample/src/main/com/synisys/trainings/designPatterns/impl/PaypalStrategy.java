package main.com.synisys.trainings.designPatterns.impl;

import java.util.Date;

import main.com.synisys.trainings.designPatterns.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy{
	private String email;
	private String password;
	
	private int amount = 500; //will receive in real life from outer source	
	
	public PaypalStrategy(String email, String password){
		this.email = email;
		this.password = password;
	}
	
	@Override
	public void pay(int amount) throws OperationCanceledException {
		if (this.amount < amount){
			throw new OperationCanceledException("No enough money on Paypal account!");
		}else{
			// pay using Paypal
			this.amount -= amount;
			System.out.println(String.format("%s amount paied with Paypal %s, owner:", email));
		}
		
	}
}
