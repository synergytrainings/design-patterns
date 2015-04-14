package main.com.synisys.trainings.designPatterns.impl;

import java.util.Date;

import main.com.synisys.trainings.designPatterns.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy{
	private String owner;
	private String number;
	private Date expirationDate;
	
	private int amount = 10000; //will receive in real life from outer source
	
	public CreditCardStrategy(String owner, String number, Date expirationDate){
		this.owner = owner;
		this.number = number;
		this.expirationDate = expirationDate;
	}
	
	@Override
	public void pay(int amount) throws OperationCanceledException {
		if (this.expirationDate.getTime() < System.currentTimeMillis()){
			throw new OperationCanceledException("Card is expired!");
		}else if (this.amount < amount){
			throw new OperationCanceledException("There is no enough money on account!");
		}else{
			// pay using card
			this.amount -= amount;
			System.out.println(String.format("%s amount paied with credit card %s, owner: %s", amount, number, owner));
		}
		
	}
}
