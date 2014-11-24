package com.synisys.training.designPatterns.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.designPatterns.composite.api.MenuItem;
import com.synisys.trainings.designPatterns.composite.impl.SeparatorMenuItem;
import com.synisys.trainings.designPatterns.composite.impl.StandardMenuItem;
import com.synisys.trainings.designPatterns.composite.impl.SubMenu;



public class CompositeTest {
	@Test
	public void test() {
		MenuItem subMenu =  new SubMenu();
		MenuItem standardItem = new StandardMenuItem("test");
		MenuItem separatorItem = new SeparatorMenuItem();
		subMenu.addMenuItem(separatorItem);
		subMenu.addMenuItem(standardItem);
		assertEquals("SubMenu SeparatorMenuItem StandardMenuItem test", subMenu.draw());
		assertEquals("SeparatorMenuItem", separatorItem.draw());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testUnsupportedOperationException() {
		MenuItem standardItem = new StandardMenuItem("test");
		MenuItem separatorItem = new SeparatorMenuItem();
		standardItem.addMenuItem(separatorItem);
	}
}
