package composite;
import java.util.LinkedList;
import java.util.List;

import composite.base.Widget;

/**
 * Composite class drawing a widget with all its components
 * @author Karen
 *
 */
public class Composite implements Widget {

	private List<Widget> components = new LinkedList<Widget>();
			
	
	@Override
	public void draw() {
		for (Widget w : components) {
			w.draw();
		}
	}
	
	public void addWidget(Widget w) {
		components.add(w);
	}
	
	public void removeWidget(Widget w) {
		components.remove(w);
	}
	

}
