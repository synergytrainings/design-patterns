package com.synisys.flyweight;

import java.awt.Color;

public class MapDrawingClient {

	private static final IconType icons[] = { IconType.WARNING, IconType.VECTOR };
	private static final Color colors[] = { Color.RED, Color.BLACK };

	public static void main(String[] args) {
		MapDrawingClient drawing = new MapDrawingClient();
		drawing.draw();
	}

	public void draw() {
		for (int i = 0; i < 10; ++i) {
			MapsIcon shape = MapIconFactory.getIcon(getRandomShape());
			shape.draw(getRandom(), getRandom(), getRandom(), getRandom(),
					getRandomColor());
		}
	}

	private IconType getRandomShape() {
		return icons[(int) (Math.random() * icons.length)];
	}

	private int getRandom() {
		return (int) (Math.random());
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}