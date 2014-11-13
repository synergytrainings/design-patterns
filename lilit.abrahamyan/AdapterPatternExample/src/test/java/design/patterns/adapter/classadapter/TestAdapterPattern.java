package design.patterns.adapter.classadapter;


import org.junit.Assert;
import org.junit.Test;

import design.patterns.adapter.classadapter.PatternScreenUnlock;

public class TestAdapterPattern {

	@Test
	public void testPatterUnlockScreen(){
		PatternScreenUnlock patternUnlock = new PatternScreenUnlock();
		Assert.assertTrue(patternUnlock.unlockScreen());
		
	}
}
