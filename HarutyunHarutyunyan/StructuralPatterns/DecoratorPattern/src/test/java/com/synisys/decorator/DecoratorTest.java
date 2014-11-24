package com.synisys.decorator;

import junit.framework.Assert;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testOrders() throws Exception {
		Order order = new OrderImpl(100);

		Order newYorkToWashingtonOrder = new LocalShippingOrderDecorator(order);

		Order washingtonToYerevanOrder = new InternationalShippingOrderDecorator(
				newYorkToWashingtonOrder);

		Assert.assertTrue("Is the Order Total Amount is 160",
				washingtonToYerevanOrder.GetTotalAmount() == 160);
	}
	
	@Test
	public void testLocalShippingOrder() throws Exception {
		Order order = new OrderImpl(100);

		Order newYorkToWashingtonOrder = new LocalShippingOrderDecorator(order);

		Assert.assertTrue("Is the Order Total Amount is 110",
				newYorkToWashingtonOrder.GetTotalAmount() == 110);
	}
	
	@Test
	public void testInternationalShippingOrder() throws Exception {
		Order order = new OrderImpl(100);

		Order washingtonToYerevanOrder = new InternationalShippingOrderDecorator(
				order);

		Assert.assertTrue("Is the Order Total Amount is 150",
				washingtonToYerevanOrder.GetTotalAmount() == 150);
	}

}
