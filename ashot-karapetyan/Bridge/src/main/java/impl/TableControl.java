package impl;

import api.Control;
import api.Type;

public class TableControl implements Control{

	public Type getType() {
		return Type.TABULAR;
	}

	public void rotate(double degree) {
		System.out.println("Table is rotated");
		
	}

	@Override
	public void scale(double scale) {
		System.out.println("Table is scaled");
	}

}
