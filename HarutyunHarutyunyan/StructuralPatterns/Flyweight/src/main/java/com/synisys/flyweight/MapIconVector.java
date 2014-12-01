package com.synisys.flyweight;

import java.awt.Color;

public class MapIconVector implements MapsIcon {

	public MapIconVector() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void draw(int x, int y, int width, int height, Color color) {
		System.out.println("draw Vector with specified color");
	}

}