package design.patterns.interpreter;


import org.junit.Assert;
import org.junit.Test;

import design.patterns.interpreter.BasicNumber;
import design.patterns.interpreter.AddExpression;
import design.patterns.interpreter.Context;

public class InterpreterTest {
	
	@Test
	public void testCalculateExpression(){

		
		Context context = new Context(true);
		Expression e = new Expression("10.5 + 5.5 - 2.5");

		Assert.assertEquals(e.getValue(context), 13.5, 1);

	}
}
