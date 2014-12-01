package com.synisys.flyweight;

import java.awt.Color;

public class MapIconWarning implements MapsIcon {

	public MapIconWarning() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void draw(int x1, int y1, int x2, int y2, Color color) {
		System.out.println("draw Warning with specified color");

	}

}