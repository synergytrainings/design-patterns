package composite.leaf;

import composite.base.Widget;

/**
 * Windows taskbar clock widget
 * @author Karen
 *
 */
public class TaskbarClock implements Widget {

	@Override
	public void draw() {
		System.out.println("Drawing windows clock on the taskbar");
	}

}
