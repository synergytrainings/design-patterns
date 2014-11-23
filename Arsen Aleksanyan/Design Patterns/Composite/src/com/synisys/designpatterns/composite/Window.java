package com.synisys.designpatterns.composite;

public class Window extends UIComponentContainer{
	
	public Window(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	
	@Override
	public void draw() {
		//TODO: Draw Window
		
		for(UIComponent component : getUIComponents()){
			component.draw();
		}
	}
	
	@Override
	public void repaint() {
		// TODO: Repaint window
		
		for(UIComponent component : getUIComponents()){
			component.repaint();
		}
	}
}
