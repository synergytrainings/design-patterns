package com.synisys.trainings.Bridge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBridge {
	Car bmw;
	Car mercedes;
	
	@Before
	public void setMessage() {
		bmw = new BMW();
		mercedes= new Mercedes();
	}

	@Test
	public void testCheck()
			throws Exception {
		Assert.assertEquals("Hello in Armenian is Barev",
				(new GermanianCar(bmw).getModel()), "700L");
		Assert.assertEquals("Hello in Russian is Privet",
				(new GermanianCar(mercedes).getModel()), "E320");
	}

}
