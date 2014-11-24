package com.synisys.decorator;

public class OrderImpl implements Order {

	public int amount;

	public OrderImpl(int amount) {
		this.amount = amount;
	}

	public int GetTotalAmount() {
		return amount;
	}
}
