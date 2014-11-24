package com.synisys.decorator;

public class LocalShippingOrderDecorator extends OrderDecorator {
	private final int LOCAL_SHIPPING_CHARGES = 10;

	public LocalShippingOrderDecorator(Order order) {
		super(order);
	}

	@Override
	public int getTotalAmount() {
		return order.getTotalAmount() + LOCAL_SHIPPING_CHARGES;
	}

}
