package design.patterns.visitor;

import org.junit.Assert;
import org.junit.Test;

import design.patterns.visitor.ArithmeticExpressionVisitor;
import design.patterns.visitor.SumExpression;
import design.patterns.visitor.Expression;

public class ArithmeticExpressionVisitorTest {
	
	@Test
	public void testTaskCollectionIterator(){

		Expression expression1 = new SumExpression(10, 20);
		Expression expression2 = new UnaryPlusExpression(10);
		
		ArithmeticExpressionVisitor visitor = new ArithmeticExpressionVisitorImpl();
		
		Assert.assertEquals(expression1.accept(visitor), 30);
		Assert.assertEquals(expression2.accept(visitor), 11);
	}
}
