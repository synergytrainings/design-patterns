package design.patterns.adapter.objectadapter;

import org.junit.Assert;
import org.junit.Test;

import design.patterns.adapter.objectadapter.PatternScreenUnlock;

public class TestAdapterPattern {
	@Test
	public void testPatterUnlockScreen(){
		GraphicalPattern pattern = new GraphicalPattern();
		PatternScreenUnlock patternUnlock = new PatternScreenUnlock(pattern);
		Assert.assertTrue(patternUnlock.unlockScreen());
		
	}
}
