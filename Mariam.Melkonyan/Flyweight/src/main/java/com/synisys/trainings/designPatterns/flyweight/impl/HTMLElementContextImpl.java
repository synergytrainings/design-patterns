package com.synisys.trainings.designPatterns.flyweight.impl;

import com.synisys.trainings.designPatterns.flyweight.api.HTMLElementContext;

public class HTMLElementContextImpl implements HTMLElementContext {
	private String backgroundColor;
	private int width;
	private int height;
	
	public HTMLElementContextImpl(String backgroundColor, int width, int height) {
		this.backgroundColor = backgroundColor;
		this.width = width;
		this.height = height;
	}
	public String getBackgroundColor() {
		return this.backgroundColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
