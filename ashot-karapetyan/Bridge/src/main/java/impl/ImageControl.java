package impl;

import api.Control;
import api.Type;

public class ImageControl implements Control {

	public Type getType() {
		return Type.SIMPLE;
	}

	public void rotate(double degree) {
		System.out.println("Image is rotated...");
	}

	@Override
	public void scale(double scale) {
		System.out.println("Image is scaled...");
	}

}
