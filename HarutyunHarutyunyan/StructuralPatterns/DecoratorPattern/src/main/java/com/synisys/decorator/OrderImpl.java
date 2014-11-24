package com.synisys.decorator;

public class OrderImpl implements Order {

	private int amount;

	public OrderImpl(int amount) {
		this.amount = amount;
	}

	public int getTotalAmount() {
		return amount;
	}
}
