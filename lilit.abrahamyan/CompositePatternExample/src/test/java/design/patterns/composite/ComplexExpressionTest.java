package design.patterns.composite;


import org.junit.Assert;


import org.junit.Test;

import design.patterns.composite.Expression;
import design.patterns.composite.ComplexExpression;

public class ComplexExpressionTest {
	
	@Test
	public void testCalculateExpression(){

		
		Expression a1 = new ArithmeticExpression();
		Expression a2 = new ArithmeticExpression();
		Expression a3 = new ArithmeticExpression();
		
		ComplexExpression e = new ComplexExpression();
		e.addExpression(a1);
		e.addExpression(a2);
		e.addExpression(a3);
		
		Assert.assertEquals(e.calculate(), a1.calculate() + a2.calculate() + a3.calculate(), 1);
	}
}
