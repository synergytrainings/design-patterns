package impl;

import api.Control;
import api.Type;

public abstract class Controller {
	
	private Control control;
	
	public Controller(Control control) {
		this.control = control;
	}
	
	public void rotateControl(double degree) {
		this.control.rotate(degree);
	}

	public void scale(double scale) {
		this.control.scale(scale);
	}

	public Type getControlType() {
		return this.control.getType();
	}
}
