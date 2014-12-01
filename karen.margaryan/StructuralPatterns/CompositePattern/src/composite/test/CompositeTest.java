package composite.test;

import org.junit.Test;

import composite.Composite;
import composite.base.Widget;
import composite.leaf.TaskbarClock;
import composite.leaf.TaskbarStart;

public class CompositeTest {

	@Test
	public void test() {
		Widget windowsClock = new TaskbarClock();
		Widget windowsStartMenu = new TaskbarStart();
		
		Composite c = new Composite();
		c.addWidget(windowsStartMenu);
		c.addWidget(windowsClock);
		c.draw();
		
	}

}
