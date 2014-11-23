package com.synisys.designpatterns.composite;

public interface UIComponent {
	int getX();
	int getY();
	int getWidth();
	int getHeight();
	
	void draw();
	void repaint();
}
