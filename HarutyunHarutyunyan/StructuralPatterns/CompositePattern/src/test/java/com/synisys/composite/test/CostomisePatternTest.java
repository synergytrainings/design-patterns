package com.synisys.composite.test;

import junit.framework.Assert;
import org.junit.Test;

import com.synisys.composite.Div;
import com.synisys.composite.Expression;
import com.synisys.composite.Minus;
import com.synisys.composite.Number;
import com.synisys.composite.Plus;
import com.synisys.composite.Times;

public class CostomisePatternTest {

	@Test
	public void testExpression() throws Exception {
		// Expresion (((25.0 + 2.0) - (3.0 * 4.0)) / 6.0)
		Expression exp = new Div(new Minus(new Plus(new Number(25.0),
				new Number(2.0)), new Times(new Number(3.0), new Number(4.0))),
				new Number(6.0));
		
		Assert.assertTrue("Is equals", exp.evaluate()
				.equals(2.5));
	}
}
