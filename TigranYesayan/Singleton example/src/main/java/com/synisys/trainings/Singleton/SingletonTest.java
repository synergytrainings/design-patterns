package com.synisys.trainings.Singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {
	
	@Before
    public void setAction(){
		FormsLoader.loader();
    }
	
	@Test
	public void testCheck() throws Exception{
		Assert.assertEquals("First form id must be 0", MySingleton.getInstance().getFormIds().get("form0").toString().equals("0"));
	}
	
	@Test
	public void testGetInstance() throws Exception{
		Assert.assertTrue("Is the two instances the same", MySingleton.getInstance() == MySingleton.getInstance());
	}
}
