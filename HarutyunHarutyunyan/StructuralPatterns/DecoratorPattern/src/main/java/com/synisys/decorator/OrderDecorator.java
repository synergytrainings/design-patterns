package com.synisys.decorator;

public abstract class OrderDecorator implements Order {
	protected Order order;

	protected OrderDecorator(Order order) {
		this.order = order;
	}

	public abstract int getTotalAmount();
}
