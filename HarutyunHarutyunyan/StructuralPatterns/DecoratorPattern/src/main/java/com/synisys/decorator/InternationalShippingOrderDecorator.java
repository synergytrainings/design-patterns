package com.synisys.decorator;

public class InternationalShippingOrderDecorator extends OrderDecorator {

	private final int INTERNATIONAL_SHIPPING_CHARGES = 50;

	protected InternationalShippingOrderDecorator(Order order) {
		super(order);
	}

	@Override
	public int getTotalAmount() {
		return order.getTotalAmount() + INTERNATIONAL_SHIPPING_CHARGES;
	}

}
