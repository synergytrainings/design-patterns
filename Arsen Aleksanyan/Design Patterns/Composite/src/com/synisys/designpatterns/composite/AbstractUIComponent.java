package com.synisys.designpatterns.composite;


public abstract class AbstractUIComponent implements UIComponent {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public AbstractUIComponent(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int getX() {
		return x;
	}
	
	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	
	@Override
	public int getHeight() {
		return height;
	}
}
