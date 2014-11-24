package com.synisys.trainings.Decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Demo {

	CarClass car1;
	CarClass car2;
	BMW bmw;
	Mercedes mercedes;

	@Before
	public void setValues() {
		car1 = new CarClass();
		car1.setName("BMW7");
		bmw = new BMW(car1);

		car2 = new CarClass();
		car2.setName("MercedesBenc");
		mercedes = new Mercedes(car2);
	}

	@Test
	public void checkName() {
		Assert.assertEquals("BMW name equlas BMW7", bmw.getName(), "BMW7");
		Assert.assertEquals("Mercedes name equlas MercedesBenc", bmw.getName(), "MercedesBenc");
	}

	@Test
	public void checkModel() {
		Assert.assertEquals("Mercedes model is C200", mercedes.getModel(), "C200");
	}

	@Test
	public void checkEngine() {
		Assert.assertEquals("BMW engine size is 5L", bmw.getEngineSize(), "5L");
	}

}
