package com.synisys.designpatterns.composite.leafs;

import com.synisys.designpatterns.composite.AbstractUIComponent;

public class CheckBox extends AbstractUIComponent {
	
	public CheckBox(int x, int y, int width, int height){
		super(x,y,width,height);
	}
	
	@Override
	public void draw() {
		//TODO: Draw checkbox
	}
	
	@Override
	public void repaint() {
		// TODO: Repaint checkbox
	}
}
