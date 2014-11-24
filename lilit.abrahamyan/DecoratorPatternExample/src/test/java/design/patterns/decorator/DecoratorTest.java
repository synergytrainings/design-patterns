package design.patterns.decorator;


import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {
	
	@Test
	public void testCalculateExpression(){

		
		Persentage p = new Persentage(new BasicNumber(10));

		Currency c = new Currency(new BasicNumber(20));
		
		Assert.assertEquals(p.getStringValue(), "10%");

		Assert.assertEquals(c.getStringValue(), "20$");
	}
}
