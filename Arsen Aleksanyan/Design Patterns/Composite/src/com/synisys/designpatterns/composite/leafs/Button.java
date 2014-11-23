package com.synisys.designpatterns.composite.leafs;

import com.synisys.designpatterns.composite.AbstractUIComponent;

public class Button extends AbstractUIComponent {
	
	public Button(int x, int y, int width, int height){
		super(x,y,width,height);
	}
	
	@Override
	public void draw() {
		//TODO: Draw button
	}
	
	@Override
	public void repaint() {
		// TODO: Repaint button
	}
}
