package com.synisys.designpatterns.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class UIComponentContainer extends AbstractUIComponent {
	private List<UIComponent> components = new ArrayList<>();
	
	public UIComponentContainer(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	
	public void addUIComponent(UIComponent component){
		this.components.add(component);
	}
	
	public void removeUIComponent(UIComponent component){
		this.components.remove(component);
	}
	
	public List<UIComponent> getUIComponents(){
		return Collections.unmodifiableList(components);
	}
}
