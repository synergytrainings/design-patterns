package com.synisys.designpatterns.composite.leafs;

import com.synisys.designpatterns.composite.AbstractUIComponent;

public class ComboBox extends AbstractUIComponent {
	
	public ComboBox(int x, int y, int width, int height){
		super(x,y,width,height);
	}
	
	@Override
	public void draw() {
		//TODO: Draw combo box
	}
	
	@Override
	public void repaint() {
		// TODO: Repaint combo box
	}
}
