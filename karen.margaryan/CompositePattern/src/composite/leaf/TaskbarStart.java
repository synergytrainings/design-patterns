package composite.leaf;

import composite.base.Widget;

/**
 * Windows taskbar start menu widget
 * @author Karen
 *
 */
public class TaskbarStart implements Widget {
	@Override
	public void draw() {
		System.out.println("Drawing windows start menu on the taskbar");
	}
}
