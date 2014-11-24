package com.synisys.decorator;

public class InternationalShippingOrderDecorator extends OrderDecorator {

	private final int INTERNATIONAL_SHIPPING_CHARGES = 50;

	protected InternationalShippingOrderDecorator(Order order) {
		super(order);
	}

	@Override
	public int GetTotalAmount() {
		return order.GetTotalAmount() + INTERNATIONAL_SHIPPING_CHARGES;
	}

}
