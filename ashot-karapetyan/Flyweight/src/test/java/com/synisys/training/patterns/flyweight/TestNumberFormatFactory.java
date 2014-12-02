package com.synisys.training.patterns.flyweight;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNumberFormatFactory {

	@Test
	public void testFormatting(){
		assertEquals("1,234.57", NumberFormatFactory.getNumberFormat("#,##0.00").format(1234.56789213123));
		assertEquals("1.2345679E3", NumberFormatFactory.getNumberFormat("##0.#####E0").format(1234.56789213123));

	}


}
