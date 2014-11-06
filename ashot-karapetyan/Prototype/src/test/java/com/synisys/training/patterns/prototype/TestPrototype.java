package com.synisys.training.patterns.prototype;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestPrototype {

	@Test
	public void testPrototypeFactory() {
		assertEquals("Green", PrototypeFactory.getInstance(Circle.class).getColor());
		assertEquals(true, PrototypeFactory.getInstance(Rectangle.class).isFilled());
		assertEquals("Black", PrototypeFactory.getInstance(Square.class).getColor());
		assertEquals(false, PrototypeFactory.getInstance(Square.class).isFilled());
	}

	@Test
	public void testDeepCopy() {
		Rectangle rectangle1 = (Rectangle) PrototypeFactory.getInstance(Rectangle.class);
		Rectangle rectangle2 = (Rectangle) PrototypeFactory.getInstance(Rectangle.class);
		assertNotEquals(rectangle1.getOuterCircle(), rectangle2.getOuterCircle());
	}

	@Test
	public void testShallowCopy() {
		Square square1 = (Square) PrototypeFactory.getInstance(Square.class);
		Square square2 = (Square) PrototypeFactory.getInstance(Square.class);
		assertEquals(square1.getOuterCircle(), square2.getOuterCircle());
	}
}
