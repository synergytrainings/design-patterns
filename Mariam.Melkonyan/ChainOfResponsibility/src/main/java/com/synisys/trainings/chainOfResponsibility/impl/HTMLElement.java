package com.synisys.trainings.chainOfResponsibility.impl;

import com.synisys.trainings.chainOfResponsibility.api.EventHandler;

public class HTMLElement implements EventHandler {
	
	private String name;
	private HTMLElement parent;
	
	public HTMLElement(String name, HTMLElement htmlElement) {
		this.name =  name;
		this.parent = htmlElement;
	}

	public void onMouseDown() {
		// call mouse down handlers for this HTML element
		System.out.println("Mouse down on " + this.name.toLowerCase() + " element");
		if(parent != null){
			parent.onMouseDown();
		}

	}

	public void onMouseUp() {
		// call mouse down handlers for this HTML element
		System.out.println("Mouse up on " + this.name.toLowerCase() + " element");
		if(parent != null){
			parent.onMouseUp();
		}
	}

	public void onClicked() {
		// call the handlers for this HTML element
		System.out.println(this.name.toLowerCase() + " element clicked");
		if(parent != null){
			parent.onClicked();
		}
	}

}
